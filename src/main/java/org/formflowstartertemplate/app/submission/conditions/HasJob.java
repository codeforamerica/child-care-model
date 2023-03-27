package org.formflowstartertemplate.app.submission.conditions;

import formflow.library.config.submission.Condition;
import formflow.library.data.Submission;
import org.springframework.stereotype.Component;

@Component
public class HasJob implements Condition {

  public Boolean run(Submission submission) {
    var inputData = submission.getInputData();
    if (inputData.containsKey("currentlyWorking")) {
      return inputData.get("currentlyWorking").equals("Yes");
    }
    return false;
  }
}
