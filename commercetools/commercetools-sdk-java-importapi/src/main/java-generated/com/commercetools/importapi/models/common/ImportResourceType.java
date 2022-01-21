
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The type of the import resource.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ImportResourceType {

    /**
    	<p>The category import resource type.</p>

    */
    ImportResourceType CATEGORY = ImportResourceTypeEnum.CATEGORY;
    /**
    	<p>The order import resource type.</p>

    */
    ImportResourceType ORDER = ImportResourceTypeEnum.ORDER;
    /**
    	<p>The order patch import resource type.</p>

    */
    ImportResourceType ORDER_PATCH = ImportResourceTypeEnum.ORDER_PATCH;
    /**
    	<p>The price import resource type.</p>

    */
    ImportResourceType PRICE = ImportResourceTypeEnum.PRICE;
    /**
    	<p>The product import resource type.</p>

    */
    ImportResourceType PRODUCT = ImportResourceTypeEnum.PRODUCT;

    ImportResourceType PRODUCT_DRAFT = ImportResourceTypeEnum.PRODUCT_DRAFT;
    /**
    	<p>The product type import resource type.</p>

    */
    ImportResourceType PRODUCT_TYPE = ImportResourceTypeEnum.PRODUCT_TYPE;
    /**
    	<p>The product variant import resource type.</p>

    */
    ImportResourceType PRODUCT_VARIANT = ImportResourceTypeEnum.PRODUCT_VARIANT;
    /**
    	<p>The product variant patch import resource type.</p>

    */
    ImportResourceType PRODUCT_VARIANT_PATCH = ImportResourceTypeEnum.PRODUCT_VARIANT_PATCH;
    /**
    	<p>The customer import resource type.</p>

    */
    ImportResourceType CUSTOMER = ImportResourceTypeEnum.CUSTOMER;

    enum ImportResourceTypeEnum implements ImportResourceType {
        CATEGORY("category"),

        ORDER("order"),

        ORDER_PATCH("order-patch"),

        PRICE("price"),

        PRODUCT("product"),

        PRODUCT_DRAFT("product-draft"),

        PRODUCT_TYPE("product-type"),

        PRODUCT_VARIANT("product-variant"),

        PRODUCT_VARIANT_PATCH("product-variant-patch"),

        CUSTOMER("customer");
        private final String jsonName;

        private ImportResourceTypeEnum(final String jsonName) {
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
    public static ImportResourceType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ImportResourceType() {
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

    public static Optional<ImportResourceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ImportResourceType[] values() {
        return ImportResourceTypeEnum.values();
    }
}
