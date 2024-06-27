
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The current indexing status of Customer Search.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomerIndexingStatus extends JsonEnum {

    /**
    <p>Indexing is scheduled.</p> */
    CustomerIndexingStatus SCHEDULED = CustomerIndexingStatusEnum.SCHEDULED;
    /**
    <p>Indexing is in progress.</p> */
    CustomerIndexingStatus INDEXING = CustomerIndexingStatusEnum.INDEXING;
    /**
    <p>Indexing is complete and the Search Customers endpoint returns up-to-date results.</p> */
    CustomerIndexingStatus READY = CustomerIndexingStatusEnum.READY;
    /**
    <p>Indexing failed due to an internal error.</p> */
    CustomerIndexingStatus FAILED = CustomerIndexingStatusEnum.FAILED;

    /**
     * possible values of CustomerIndexingStatus
     */
    enum CustomerIndexingStatusEnum implements CustomerIndexingStatus {
        /**
         * Scheduled
         */
        SCHEDULED("Scheduled"),

        /**
         * Indexing
         */
        INDEXING("Indexing"),

        /**
         * Ready
         */
        READY("Ready"),

        /**
         * Failed
         */
        FAILED("Failed");
        private final String jsonName;

        private CustomerIndexingStatusEnum(final String jsonName) {
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
     * factory method for a enum value of CustomerIndexingStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static CustomerIndexingStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CustomerIndexingStatus() {
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
    public static Optional<CustomerIndexingStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static CustomerIndexingStatus[] values() {
        return CustomerIndexingStatusEnum.values();
    }

}
