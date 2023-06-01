package com.commercetools.importapi.models.customers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AuthenticationMode
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface AuthenticationMode extends JsonEnum {

    /**
    	<p>If set, the <code>password</code> field is required for the Customer.</p>
    	
    */
    AuthenticationMode PASSWORD = AuthenticationModeEnum.PASSWORD;
    /**
    	<p>If set, the <code>password</code> field is optional for the Customer.</p>
    	
    */
    AuthenticationMode EXTERNAL_AUTH = AuthenticationModeEnum.EXTERNAL_AUTH;
    
    /**
     * possible values of AuthenticationMode
     */
    enum AuthenticationModeEnum implements AuthenticationMode {
        /**
         * Password
         */
        PASSWORD("Password"),
        
        /**
         * ExternalAuth
         */
        EXTERNAL_AUTH("ExternalAuth");
        private final String jsonName;

        private AuthenticationModeEnum(final String jsonName) {
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
     * factory method for a enum value of AuthenticationMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AuthenticationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AuthenticationMode() {
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
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<AuthenticationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AuthenticationMode[] values() {
        return AuthenticationModeEnum.values();
    }
    
}
