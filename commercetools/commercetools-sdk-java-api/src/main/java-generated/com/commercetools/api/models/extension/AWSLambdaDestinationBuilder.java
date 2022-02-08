
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AWSLambdaDestinationBuilder implements Builder<AWSLambdaDestination> {

    private String arn;

    private String accessKey;

    private String accessSecret;

    public AWSLambdaDestinationBuilder arn(final String arn) {
        this.arn = arn;
        return this;
    }

    public AWSLambdaDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public AWSLambdaDestinationBuilder accessSecret(final String accessSecret) {
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

    public AWSLambdaDestination build() {
        Objects.requireNonNull(arn, AWSLambdaDestination.class + ": arn is missing");
        Objects.requireNonNull(accessKey, AWSLambdaDestination.class + ": accessKey is missing");
        Objects.requireNonNull(accessSecret, AWSLambdaDestination.class + ": accessSecret is missing");
        return new AWSLambdaDestinationImpl(arn, accessKey, accessSecret);
    }

    /**
     * builds AWSLambdaDestination without checking for non null required values
     */
    public AWSLambdaDestination buildUnchecked() {
        return new AWSLambdaDestinationImpl(arn, accessKey, accessSecret);
    }

    public static AWSLambdaDestinationBuilder of() {
        return new AWSLambdaDestinationBuilder();
    }

    public static AWSLambdaDestinationBuilder of(final AWSLambdaDestination template) {
        AWSLambdaDestinationBuilder builder = new AWSLambdaDestinationBuilder();
        builder.arn = template.getArn();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        return builder;
    }

}
