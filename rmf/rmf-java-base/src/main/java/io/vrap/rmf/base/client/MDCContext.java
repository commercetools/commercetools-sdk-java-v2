
package io.vrap.rmf.base.client;

import java.util.Map;

import org.slf4j.MDC;

public class MDCContext implements Context {
    final Map<String, String> contextMap;

    public MDCContext() {
        contextMap = MDC.getCopyOfContextMap();
    }

    public MDCContext(Map<String, String> contextMap) {
        this.contextMap = contextMap;
    }

    @Override
    public Map<String, String> getValue() {
        return contextMap;
    }
}
