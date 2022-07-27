
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AuthenticationMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AuthenticationMode {

    AuthenticationMode PASSWORD = AuthenticationModeEnum.PASSWORD;

    AuthenticationMode EXTERNAL_AUTH = AuthenticationModeEnum.EXTERNAL_AUTH;

    enum AuthenticationModeEnum implements AuthenticationMode {
        PASSWORD("Password"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<AuthenticationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static AuthenticationMode[] values() {
        return AuthenticationModeEnum.values();
    }
}
