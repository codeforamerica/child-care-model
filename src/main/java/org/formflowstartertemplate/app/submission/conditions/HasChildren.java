package org.formflowstartertemplate.app.submission.conditions;

import formflow.library.config.submission.Condition;
import formflow.library.data.Submission;
import org.springframework.stereotype.Component;

@Component
public class HasChildren implements Condition {

  public Boolean run(Submission submission) {
    var inputData = submission.getInputData();
    if (inputData.containsKey("hasChildren")) {
      return inputData.get("hasChildren").equals("true");
    }
    return false;
  }
}
