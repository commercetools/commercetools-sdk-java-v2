
package com.commercetools.api.models.channel;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChannelRoleEnum {

    ChannelRoleEnum INVENTORY_SUPPLY = ChannelRoleEnumEnum.INVENTORY_SUPPLY;

    ChannelRoleEnum PRODUCT_DISTRIBUTION = ChannelRoleEnumEnum.PRODUCT_DISTRIBUTION;

    ChannelRoleEnum ORDER_EXPORT = ChannelRoleEnumEnum.ORDER_EXPORT;

    ChannelRoleEnum ORDER_IMPORT = ChannelRoleEnumEnum.ORDER_IMPORT;

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
