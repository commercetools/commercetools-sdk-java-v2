
package com.commercetools.http.javanet;

import io.vrap.rmf.base.client.SolutionInfo;

import org.apache.commons.lang3.SystemUtils;

public class JavaNetHttpClientSolutionInfo extends SolutionInfo {

    public JavaNetHttpClientSolutionInfo() {
        setName("JavaNetHttpClient");
        setVersion(SystemUtils.JAVA_RUNTIME_VERSION);
    }
}
