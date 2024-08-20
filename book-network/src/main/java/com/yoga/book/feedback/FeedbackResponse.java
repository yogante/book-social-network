package com.yoga.book.feedback;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FeedbackResponse {
    private Double note;
    private  String comment;
    private boolean ownFeedback;
}
