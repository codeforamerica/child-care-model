package org.formflowstartertemplate.app;

import java.util.HashMap;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * A controller to render static pages that are not in any flow.
 */
@Controller
public class StaticPageController {

  /**
   * Renders the website index page.
   *
   * @param httpSession The current HTTP session, not null
   * @return the static page template
   */
  @GetMapping("/")
  ModelAndView getIndex(HttpSession httpSession) {
    // For dev, reset session if you visit home
    httpSession.invalidate();

    // provide a model so that we can pass the git commit hash to the footer, via the index page.
    HashMap<String, Object> model = new HashMap<>();
    model.put("codeCommitHashShort", null);
    model.put("codeCommitDateTime", null);

    return new ModelAndView("index", model);
  }

  /**
   * Renders the website faq page.
   *
   * @return the static page template
   */
  @GetMapping("/faq")
  String getFaq() { return "faq"; }

  @GetMapping("/requirements")
  String getRequirements() { return "requirements"; }

  @GetMapping("/privacy")
  String getPrivacy() { return "privacy"; }
}
