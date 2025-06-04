
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource types supported by EventSubscriptions.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface EventSubscriptionResourceTypeId extends JsonEnum {

    /**
    <p>Events related to Checkout.</p> */
    EventSubscriptionResourceTypeId CHECKOUT = EventSubscriptionResourceTypeIdEnum.CHECKOUT;
    /**
    <p>Events related to the Import API.</p> */
    EventSubscriptionResourceTypeId IMPORT_API = EventSubscriptionResourceTypeIdEnum.IMPORT_API;

    /**
     * possible values of EventSubscriptionResourceTypeId
     */
    enum EventSubscriptionResourceTypeIdEnum implements EventSubscriptionResourceTypeId {
        /**
         * checkout
         */
        CHECKOUT("checkout"),

        /**
         * import-api
         */
        IMPORT_API("import-api");
        private final String jsonName;

        private EventSubscriptionResourceTypeIdEnum(final String jsonName) {
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
     * factory method for a enum value of EventSubscriptionResourceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static EventSubscriptionResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new EventSubscriptionResourceTypeId() {
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
    public static Optional<EventSubscriptionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static EventSubscriptionResourceTypeId[] values() {
        return EventSubscriptionResourceTypeIdEnum.values();
    }

}
