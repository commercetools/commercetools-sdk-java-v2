
package com.commerctools.importapi.defaultconfig;

import java.util.UUID;

import com.commercetools.importapi.client.ByProjectKeyRequestBuilder;
import com.commercetools.importapi.defaultconfig.ImportApiFactory;
import com.commercetools.importapi.defaultconfig.ServiceRegion;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.LocalizedStringImpl;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ImportApiTestUtils {

    private static final ByProjectKeyRequestBuilder projectRoot;

    static {
        String logLevel = System.getenv("CTP_JVM_SDK_LOG_LEVEL");
        if ("OFF".equals(logLevel)) {
            projectRoot = ImportApiFactory.createForProject(getProjectKey(),
                ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).withScopes(
                    getScopes()).build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
        }
        else {
            projectRoot = ImportApiFactory.createForProject(getProjectKey(),
                ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).withScopes(
                    getScopes()).build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
        }
    }

    public static String randomString() {
        return "random-string-" + UUID.randomUUID().toString();
    }

    public static String randomId() {
        return "random-id-" + UUID.randomUUID().toString();
    }

    public static String randomKey() {
        return "random-key-" + UUID.randomUUID().toString();
    }

    public static LocalizedString randomLocalizedString() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue(randomString(), randomString());
        return localizedString;
    }

    public static String getProjectKey() {
        return System.getenv("CTP_PROJECT_KEY");
    }

    public static String getClientId() {
        return System.getenv("CTP_CLIENT_ID");
    }

    public static String getClientSecret() {
        return System.getenv("CTP_CLIENT_SECRET");
    }

    public static String getScopes() {
        return "manage_project:" + getProjectKey() + " manage_api_clients:" + getProjectKey();
    }

    public static ByProjectKeyRequestBuilder getProjectRoot() {
        return projectRoot;
    }

}
