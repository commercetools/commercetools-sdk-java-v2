
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChannelRole {

    ChannelRole INVENTORY_SUPPLY = ChannelRoleEnum.INVENTORY_SUPPLY;

    ChannelRole PRODUCT_DISTRIBUTION = ChannelRoleEnum.PRODUCT_DISTRIBUTION;

    ChannelRole ORDER_EXPORT = ChannelRoleEnum.ORDER_EXPORT;

    ChannelRole ORDER_IMPORT = ChannelRoleEnum.ORDER_IMPORT;

    ChannelRole PRIMARY = ChannelRoleEnum.PRIMARY;

    enum ChannelRoleEnum implements ChannelRole {
        INVENTORY_SUPPLY("InventorySupply"),

        PRODUCT_DISTRIBUTION("ProductDistribution"),

        ORDER_EXPORT("OrderExport"),

        ORDER_IMPORT("OrderImport"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<ChannelRole> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ChannelRole[] values() {
        return ChannelRoleEnum.values();
    }
}
