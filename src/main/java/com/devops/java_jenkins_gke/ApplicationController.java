
package com.devops.java_jenkins_gke;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public String home() {
        return "Java Jenkins Kubernetes GCP application is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}