package examples;

import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selectors.shadowDeepCss;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class ShadowRootDemo {

    @Test
    void shadowRootDemo00() {

        open("https://the-internet.herokuapp.com/shadowdom");

        ElementsCollection simpleLocatorProbe = $$("[name='my-text']");

        System.out.println("Common DOM search found elements: " + simpleLocatorProbe.size());


        ElementsCollection shadowLocatorProbeA = $$(shadowCss("[name='my-text']", "my-paragraph"));

        System.out.println("Shadow DOM search A found elements: " + shadowLocatorProbeA.size());


        ElementsCollection shadowLocatorProbeB = $$(shadowCss("[name='my-text']", "my-paragraph:nth-child(4)"));

        System.out.println("Shadow DOM search B found elements: " + shadowLocatorProbeB.size());


        ElementsCollection shadowLocatorProbeDeep = $$(shadowDeepCss("[name='my-text']"));

        System.out.println("Deep Shadow DOM search found elements: " + shadowLocatorProbeDeep.size());

        System.out.println("End of test code reached");

    }


}
