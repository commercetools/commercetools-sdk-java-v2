
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Specifies the status of the Product Search index.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSearchStatus extends JsonEnum {

    /**
    <p>indicates that the Search Products endpoint is fully operational.</p> */
    ProductSearchStatus ACTIVATED = ProductSearchStatusEnum.ACTIVATED;
    /**
    <p>indicates that the Product Search feature is currently not active.</p> */
    ProductSearchStatus DEACTIVATED = ProductSearchStatusEnum.DEACTIVATED;

    /**
     * possible values of ProductSearchStatus
     */
    enum ProductSearchStatusEnum implements ProductSearchStatus {
        /**
         * Activated
         */
        ACTIVATED("Activated"),

        /**
         * Deactivated
         */
        DEACTIVATED("Deactivated");
        private final String jsonName;

        private ProductSearchStatusEnum(final String jsonName) {
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
     * factory method for a enum value of ProductSearchStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProductSearchStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductSearchStatus() {
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
    public static Optional<ProductSearchStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductSearchStatus[] values() {
        return ProductSearchStatusEnum.values();
    }

}
