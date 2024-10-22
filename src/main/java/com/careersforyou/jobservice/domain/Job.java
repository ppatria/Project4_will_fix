package com.careersforyou.jobservice.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public record Job (

        // These validation constraints ensure when HTTP requests are made, they require to specify valid fields

        // NotBlank means there has to be something filled out for that field
        @NotBlank(message = "The job ID must be defined.")
        // This first pattern restricts jobid to only numbers and it has to be exactly 10 digits long
        @Pattern(
                regexp = "^([0-9]{10})$",
                message = "The ISBN format must be valid."
        )
        String jobid,
        @NotBlank(message = "The job title must be defined."
        )
        // The next patterns restrict the field to consisting of lower or uppercase letters, numbers and spaces
        @Pattern(
                regexp = "^[a-zA-Z0-9 ]+$"
        )
        String title,
        @NotBlank(message = "The job description must be defined."
        )
        @Pattern(
                regexp = "^[a-zA-Z0-9 ]+$"
        )
        String description,
        @NotBlank(message = "The company name must be defined."
        )
        @Pattern(
                regexp = "^[a-zA-Z0-9 ]+$"
        )
        String companyname,
        @NotBlank(message = "Skill1 must be defined."
        )
        @Pattern(
                regexp = "^[a-zA-Z0-9 ]+$"
        )
        String skill1,
        @NotBlank(message = "Skill2 must be defined."
        )
        @Pattern(
                regexp = "^[a-zA-Z0-9 ]+$"
        )
        String skill2
){}
