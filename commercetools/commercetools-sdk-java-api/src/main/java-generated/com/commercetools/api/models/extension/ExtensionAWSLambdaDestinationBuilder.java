
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionAWSLambdaDestinationBuilder {

    private String arn;

    private String accessKey;

    private String accessSecret;

    public ExtensionAWSLambdaDestinationBuilder arn(final String arn) {
        this.arn = arn;
        return this;
    }

    public ExtensionAWSLambdaDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public ExtensionAWSLambdaDestinationBuilder accessSecret(final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    public String getArn() {
        return this.arn;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAccessSecret() {
        return this.accessSecret;
    }

    public ExtensionAWSLambdaDestination build() {
        return new ExtensionAWSLambdaDestinationImpl(arn, accessKey, accessSecret);
    }

    public static ExtensionAWSLambdaDestinationBuilder of() {
        return new ExtensionAWSLambdaDestinationBuilder();
    }

    public static ExtensionAWSLambdaDestinationBuilder of(final ExtensionAWSLambdaDestination template) {
        ExtensionAWSLambdaDestinationBuilder builder = new ExtensionAWSLambdaDestinationBuilder();
        builder.arn = template.getArn();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        return builder;
    }

}
