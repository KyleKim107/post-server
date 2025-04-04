package com.example.postserver;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic postCreatedTopic() {
        return new NewTopic("post.created", 1, (short)1);
    }
    @Bean
    public NewTopic lastPostUpatedTopic() {
        return new NewTopic("post.updated", 1, (short)1);
    }
}
