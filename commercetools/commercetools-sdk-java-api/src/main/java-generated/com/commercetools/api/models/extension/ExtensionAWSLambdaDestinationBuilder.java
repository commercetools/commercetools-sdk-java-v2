
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionAWSLambdaDestinationBuilder implements Builder<ExtensionAWSLambdaDestination> {

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
        Objects.requireNonNull(arn, ExtensionAWSLambdaDestination.class + ": arn is missing");
        Objects.requireNonNull(accessKey, ExtensionAWSLambdaDestination.class + ": accessKey is missing");
        Objects.requireNonNull(accessSecret, ExtensionAWSLambdaDestination.class + ": accessSecret is missing");
        return new ExtensionAWSLambdaDestinationImpl(arn, accessKey, accessSecret);
    }

    /**
     * builds ExtensionAWSLambdaDestination without checking for non null required values
     */
    public ExtensionAWSLambdaDestination buildUnchecked() {
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
