
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SqsDestinationBuilder implements Builder<SqsDestination> {

    private String accessKey;

    private String accessSecret;

    private String queueUrl;

    private String region;

    public SqsDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public SqsDestinationBuilder accessSecret(final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    public SqsDestinationBuilder queueUrl(final String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    public SqsDestinationBuilder region(final String region) {
        this.region = region;
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAccessSecret() {
        return this.accessSecret;
    }

    public String getQueueUrl() {
        return this.queueUrl;
    }

    public String getRegion() {
        return this.region;
    }

    public SqsDestination build() {
        Objects.requireNonNull(accessKey, SqsDestination.class + ": accessKey is missing");
        Objects.requireNonNull(accessSecret, SqsDestination.class + ": accessSecret is missing");
        Objects.requireNonNull(queueUrl, SqsDestination.class + ": queueUrl is missing");
        Objects.requireNonNull(region, SqsDestination.class + ": region is missing");
        return new SqsDestinationImpl(accessKey, accessSecret, queueUrl, region);
    }

    /**
     * builds SqsDestination without checking for non null required values
     */
    public SqsDestination buildUnchecked() {
        return new SqsDestinationImpl(accessKey, accessSecret, queueUrl, region);
    }

    public static SqsDestinationBuilder of() {
        return new SqsDestinationBuilder();
    }

    public static SqsDestinationBuilder of(final SqsDestination template) {
        SqsDestinationBuilder builder = new SqsDestinationBuilder();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        builder.queueUrl = template.getQueueUrl();
        builder.region = template.getRegion();
        return builder;
    }

}
