package org.spring.tutorial.examples.batch.writers;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSourceWriter implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> email) throws Exception {

        System.out.println("Writing the data " + email);
    }
}
