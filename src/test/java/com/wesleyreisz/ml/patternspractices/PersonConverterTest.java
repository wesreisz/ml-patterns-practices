package com.wesleyreisz.ml.patternspractices;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class PersonConverterTest {
    @Test
    public void convertPersonToJobTest(){
        Job job = new Job();
        Person person = new Person(10,"Software Engineer");
        job = PersonUtil.mapPersonToJob.apply(person);
        assertEquals(job.getDescription(),person.getJobDecription());
        assertEquals(job.getPersonId(),person.getPersonId());
    }
    @Test
    public void convertPersonToJobTestOnStream(){
        List<Person> persons = Lists.newArrayList(
                new Person(2,"SWE"),
                new Person(2,"Dad"),
                new Person(3,"QCon Chair"),
                new Person(4,"Husband"),
                new Person(5,"Adjunct Professor")
        );

        List<Job> jobs = persons.stream().map(PersonUtil.mapPersonToJob).collect(Collectors.toList());

        assertEquals(5,jobs.size());
        assertEquals(persons.get(2).getPersonId(), jobs.get(2).getPersonId());
    }
}
