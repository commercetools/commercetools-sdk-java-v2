
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines the method of authentication for AWS SQS and SNS Destinations.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AwsAuthenticationMode extends JsonEnum {

    /**
    	<p>Subscriptions with <code>Credentials</code> authentication mode are authenticated using an <code>accessKey</code> and <code>accessSecret</code> pair. This is the default authentication mode for backwards compatibility.</p>

    */
    AwsAuthenticationMode CREDENTIALS = AwsAuthenticationModeEnum.CREDENTIALS;
    /**
    	<p>Subscriptions with <code>IAM</code> authentication mode are authenticated using Identity and Access Management (IAM). In this case, the user <code>arn:aws:iam::362576667341:user/subscriptions</code> requires permissions to send messages to the queue or publish to the topic. This is the recommended authentication mode, as it doesn't require additional key management.</p>

    */
    AwsAuthenticationMode IAM = AwsAuthenticationModeEnum.IAM;

    /**
     * possible values of AwsAuthenticationMode
     */
    enum AwsAuthenticationModeEnum implements AwsAuthenticationMode {
        /**
         * Credentials
         */
        CREDENTIALS("Credentials"),

        /**
         * IAM
         */
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

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of AwsAuthenticationMode
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @return optional of enum instance
     */
    public static Optional<AwsAuthenticationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AwsAuthenticationMode[] values() {
        return AwsAuthenticationModeEnum.values();
    }

}
