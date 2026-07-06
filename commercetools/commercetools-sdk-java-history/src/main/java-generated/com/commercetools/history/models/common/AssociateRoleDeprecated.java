
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Roles defining how an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> can interact with a Business Unit.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AssociateRoleDeprecated extends JsonEnum {

    AssociateRoleDeprecated ADMIN = AssociateRoleDeprecatedEnum.ADMIN;

    AssociateRoleDeprecated BUYER = AssociateRoleDeprecatedEnum.BUYER;

    /**
     * possible values of AssociateRoleDeprecated
     */
    enum AssociateRoleDeprecatedEnum implements AssociateRoleDeprecated {
        /**
         * Admin
         */
        ADMIN("Admin"),

        /**
         * Buyer
         */
        BUYER("Buyer");
        private final String jsonName;

        private AssociateRoleDeprecatedEnum(final String jsonName) {
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
     * factory method for a enum value of AssociateRoleDeprecated
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AssociateRoleDeprecated findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AssociateRoleDeprecated() {
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
    public static Optional<AssociateRoleDeprecated> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AssociateRoleDeprecated[] values() {
        return AssociateRoleDeprecatedEnum.values();
    }

}
