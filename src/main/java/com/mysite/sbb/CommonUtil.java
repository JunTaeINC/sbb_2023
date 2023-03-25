package com.mysite.sbb;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;


@Component
public class CommonUtil {

    public String markDown(String markDown) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markDown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }
}
