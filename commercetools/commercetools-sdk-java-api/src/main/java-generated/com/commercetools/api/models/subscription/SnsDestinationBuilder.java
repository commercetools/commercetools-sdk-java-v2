
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SnsDestinationBuilder implements Builder<SnsDestination> {

    private String accessKey;

    private String accessSecret;

    private String topicArn;

    public SnsDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public SnsDestinationBuilder accessSecret(final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    public SnsDestinationBuilder topicArn(final String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAccessSecret() {
        return this.accessSecret;
    }

    public String getTopicArn() {
        return this.topicArn;
    }

    public SnsDestination build() {
        Objects.requireNonNull(accessKey, SnsDestination.class + ": accessKey is missing");
        Objects.requireNonNull(accessSecret, SnsDestination.class + ": accessSecret is missing");
        Objects.requireNonNull(topicArn, SnsDestination.class + ": topicArn is missing");
        return new SnsDestinationImpl(accessKey, accessSecret, topicArn);
    }

    /**
     * builds SnsDestination without checking for non null required values
     */
    public SnsDestination buildUnchecked() {
        return new SnsDestinationImpl(accessKey, accessSecret, topicArn);
    }

    public static SnsDestinationBuilder of() {
        return new SnsDestinationBuilder();
    }

    public static SnsDestinationBuilder of(final SnsDestination template) {
        SnsDestinationBuilder builder = new SnsDestinationBuilder();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        builder.topicArn = template.getTopicArn();
        return builder;
    }

}
