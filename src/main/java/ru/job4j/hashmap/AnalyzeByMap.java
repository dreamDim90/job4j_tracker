package ru.job4j.hashmap;

import java.util.*;

import static java.util.Comparator.naturalOrder;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0;
        int subjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                 score += subject.score();
                 subjects++;
            }
        }
        return score / subjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sumScore = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            rsl.add(new Label(pupil.name(), sumScore / pupil.subjects().size()));
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> values = new HashMap<>();
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                values.put(subject.name(), values.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (String value : values.keySet()) {
            rsl.add(new Label(value, (double) values.get(value) / pupils.size()));
        }
         return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        Label value = new Label("", 0);
        for (Pupil pupil : pupils) {
            double sumScore = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            rsl.add(new Label(pupil.name(), sumScore));
        }
        for (Label result : rsl) {
            if (value.compareTo(result) == -1) {
                value = result;
            }
        }
        return value;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> values = new HashMap<>();
        List<Label> rsl = new ArrayList<>();
        Label results = new Label("", 0);
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                values.put(subject.name(), values.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (String value : values.keySet()) {
            rsl.add(new Label(value, values.get(value)));
        }
        for (Label result : rsl) {
            if (results.compareTo(result) == -1) {
                results = result;
            }
        }
        return results;
    }
}
