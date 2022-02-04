
package com.commercetools.api.models.channel;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Describes the purpose and type of the Channel. A Channel can have one or more roles.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChannelRoleEnum {

    /**
    	<p>Channel can be used to track inventory entries (for example, Channels with this role can be treated as warehouses).</p>

    */
    ChannelRoleEnum INVENTORY_SUPPLY = ChannelRoleEnumEnum.INVENTORY_SUPPLY;
    /**
    	<p>Channel can be used to expose Products to a specific distribution Channel.
    	The Channel can be used by a Cart to <a href="/../api/projects/carts#lineitem-price-selection">select</a> a Product Price.</p>

    */
    ChannelRoleEnum PRODUCT_DISTRIBUTION = ChannelRoleEnumEnum.PRODUCT_DISTRIBUTION;
    /**
    	<p>Channel can be used to track order export activities.</p>

    */
    ChannelRoleEnum ORDER_EXPORT = ChannelRoleEnumEnum.ORDER_EXPORT;
    /**
    	<p>Channel can be used to track order import activities.</p>

    */
    ChannelRoleEnum ORDER_IMPORT = ChannelRoleEnumEnum.ORDER_IMPORT;
    /**
    	<p>This role can be combined with the other roles (for example, with <code>InventorySupply</code>). If used, the Channel is considered as the primary or main channel among Channels of the same type.</p>

    */
    ChannelRoleEnum PRIMARY = ChannelRoleEnumEnum.PRIMARY;

    enum ChannelRoleEnumEnum implements ChannelRoleEnum {
        INVENTORY_SUPPLY("InventorySupply"),

        PRODUCT_DISTRIBUTION("ProductDistribution"),

        ORDER_EXPORT("OrderExport"),

        ORDER_IMPORT("OrderImport"),

        PRIMARY("Primary");
        private final String jsonName;

        private ChannelRoleEnumEnum(final String jsonName) {
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
    public static ChannelRoleEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ChannelRoleEnum() {
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

    public static Optional<ChannelRoleEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ChannelRoleEnum[] values() {
        return ChannelRoleEnumEnum.values();
    }
}
