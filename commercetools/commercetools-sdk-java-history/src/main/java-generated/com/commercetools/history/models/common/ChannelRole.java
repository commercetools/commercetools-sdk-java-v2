
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelRole
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChannelRole {

    ChannelRole INVENTORY_SUPPLY = ChannelRoleEnum.INVENTORY_SUPPLY;

    ChannelRole PRODUCT_DISTRIBUTION = ChannelRoleEnum.PRODUCT_DISTRIBUTION;

    ChannelRole ORDER_EXPORT = ChannelRoleEnum.ORDER_EXPORT;

    ChannelRole ORDER_IMPORT = ChannelRoleEnum.ORDER_IMPORT;

    ChannelRole PRIMARY = ChannelRoleEnum.PRIMARY;

    /**
     * possible values of ChannelRole
     */
    enum ChannelRoleEnum implements ChannelRole {
        /**
         * InventorySupply
         */
        INVENTORY_SUPPLY("InventorySupply"),

        /**
         * ProductDistribution
         */
        PRODUCT_DISTRIBUTION("ProductDistribution"),

        /**
         * OrderExport
         */
        ORDER_EXPORT("OrderExport"),

        /**
         * OrderImport
         */
        ORDER_IMPORT("OrderImport"),

        /**
         * Primary
         */
        PRIMARY("Primary");
        private final String jsonName;

        private ChannelRoleEnum(final String jsonName) {
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
     * factory method for a enum value of ChannelRole
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static ChannelRole findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ChannelRole() {
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
    public static Optional<ChannelRole> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ChannelRole[] values() {
        return ChannelRoleEnum.values();
    }

}
