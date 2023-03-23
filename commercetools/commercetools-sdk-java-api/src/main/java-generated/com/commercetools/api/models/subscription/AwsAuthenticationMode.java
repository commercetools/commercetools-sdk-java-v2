
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines the method of authentication for AWS SQS and SNS Destinations.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AwsAuthenticationMode {

    /**
    	<p>Subscriptions with <code>Credentials</code> authentication mode are authenticated using an <code>accessKey</code> and <code>accessSecret</code> pair. This is the default authentication mode for backwards compatibility.</p>

    */
    AwsAuthenticationMode CREDENTIALS = AwsAuthenticationModeEnum.CREDENTIALS;
    /**
    	<p>Subscriptions with <code>IAM</code> authentication mode are authenticated using Identity and Access Management (IAM). In this case, the user <code>arn:aws:iam::362576667341:user/subscriptions</code> requires permissions to send messages to the queue or publish to the topic. This is the recommended authentication mode, as it doesn't require additional key management.</p>

    */
    AwsAuthenticationMode IAM = AwsAuthenticationModeEnum.IAM;

    enum AwsAuthenticationModeEnum implements AwsAuthenticationMode {
        CREDENTIALS("Credentials"),

        IAM("IAM");
        private final String jsonName;

        private AwsAuthenticationModeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static AwsAuthenticationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AwsAuthenticationMode() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<AwsAuthenticationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static AwsAuthenticationMode[] values() {
        return AwsAuthenticationModeEnum.values();
    }

}
