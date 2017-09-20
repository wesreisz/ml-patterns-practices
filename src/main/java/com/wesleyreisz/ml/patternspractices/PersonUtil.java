package com.wesleyreisz.ml.patternspractices;

import java.util.function.Function;

public class PersonUtil {
    public static Function<Person, Job> mapPersonToJob = new Function<Person, Job>() {
        @Override
        public Job apply(Person person) {
            Job job = new Job(person.getPersonId(),person.getJobDecription());
            return job;
        }
    };
}
