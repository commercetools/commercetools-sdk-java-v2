
package com.commercetools.api.models.business_unit;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Roles defining how an Associate can interact with a Business Unit.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AssociateRole {

    /**
    	<p>The Associate can update the Business Unit, create child Business Units and add or remove other Associates.</p>

    */
    AssociateRole ADMIN = AssociateRoleEnum.ADMIN;
    /**
    	<p>The Associate can make purchases on behalf of the Business Unit.</p>

    */
    AssociateRole BUYER = AssociateRoleEnum.BUYER;

    /**
     * possible values of AssociateRole
     */
    enum AssociateRoleEnum implements AssociateRole {
        /**
         * Admin
         */
        ADMIN("Admin"),

        /**
         * Buyer
         */
        BUYER("Buyer");
        private final String jsonName;

        private AssociateRoleEnum(final String jsonName) {
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
     * factory method for a enum value of AssociateRole
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static AssociateRole findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AssociateRole() {
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
    public static Optional<AssociateRole> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AssociateRole[] values() {
        return AssociateRoleEnum.values();
    }

}
