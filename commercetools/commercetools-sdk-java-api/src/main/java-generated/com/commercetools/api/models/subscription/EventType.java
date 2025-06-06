
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Type of events supported by EventSubscriptions.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface EventType extends JsonEnum {

    /**
    <p>Indicates a Checkout Order Creation Failed Event.</p> */
    EventType CHECKOUT_ORDER_CREATION_FAILED = EventTypeEnum.CHECKOUT_ORDER_CREATION_FAILED;
    /**
    <p>Indicates a Checkout Payment Authorization Cancelled Event.</p> */
    EventType CHECKOUT_PAYMENT_AUTHORIZATION_CANCELLED = EventTypeEnum.CHECKOUT_PAYMENT_AUTHORIZATION_CANCELLED;
    /**
    <p>Indicates a Checkout Payment Authorization Failed Event.</p> */
    EventType CHECKOUT_PAYMENT_AUTHORIZATION_FAILED = EventTypeEnum.CHECKOUT_PAYMENT_AUTHORIZATION_FAILED;
    /**
    <p>Indicates a Checkout PaymentAuthorized Event.</p> */
    EventType CHECKOUT_PAYMENT_AUTHORIZED = EventTypeEnum.CHECKOUT_PAYMENT_AUTHORIZED;
    /**
    <p>Indicates a Checkout Payment Cancel Authorization Failed Event.</p> */
    EventType CHECKOUT_PAYMENT_CANCEL_AUTHORIZATION_FAILED = EventTypeEnum.CHECKOUT_PAYMENT_CANCEL_AUTHORIZATION_FAILED;
    /**
    <p>Indicates a Checkout Payment Charged Event.</p> */
    EventType CHECKOUT_PAYMENT_CHARGED = EventTypeEnum.CHECKOUT_PAYMENT_CHARGED;
    /**
    <p>Indicates a Checkout Payment Charge Failed Event.</p> */
    EventType CHECKOUT_PAYMENT_CHARGE_FAILED = EventTypeEnum.CHECKOUT_PAYMENT_CHARGE_FAILED;
    /**
    <p>Indicates a Checkout Payment Refunded Event.</p> */
    EventType CHECKOUT_PAYMENT_REFUNDED = EventTypeEnum.CHECKOUT_PAYMENT_REFUNDED;
    /**
    <p>Indicates a Checkout Payment Refund Failed Event.</p> */
    EventType CHECKOUT_PAYMENT_REFUND_FAILED = EventTypeEnum.CHECKOUT_PAYMENT_REFUND_FAILED;
    /**
    <p>Indicates an Import Container Created Event.</p> */
    EventType IMPORT_CONTAINER_CREATED = EventTypeEnum.IMPORT_CONTAINER_CREATED;
    /**
    <p>Indicates an Import Container Deleted Event.</p> */
    EventType IMPORT_CONTAINER_DELETED = EventTypeEnum.IMPORT_CONTAINER_DELETED;
    /**
    <p>Indicates an Import Operation Rejected Event.</p> */
    EventType IMPORT_OPERATION_REJECTED = EventTypeEnum.IMPORT_OPERATION_REJECTED;
    /**
    <p>Indicates an Import Unresolved Event.</p> */
    EventType IMPORT_UNRESOLVED = EventTypeEnum.IMPORT_UNRESOLVED;
    /**
    <p>Indicates an Import Validation Failed Event.</p> */
    EventType IMPORT_VALIDATION_FAILED = EventTypeEnum.IMPORT_VALIDATION_FAILED;
    /**
    <p>Indicates an Import Wait For Master Variant Event.</p> */
    EventType IMPORT_WAIT_FOR_MASTER_VARIANT = EventTypeEnum.IMPORT_WAIT_FOR_MASTER_VARIANT;

    /**
     * possible values of EventType
     */
    enum EventTypeEnum implements EventType {
        /**
         * CheckoutOrderCreationFailed
         */
        CHECKOUT_ORDER_CREATION_FAILED("CheckoutOrderCreationFailed"),

        /**
         * CheckoutPaymentAuthorizationCancelled
         */
        CHECKOUT_PAYMENT_AUTHORIZATION_CANCELLED("CheckoutPaymentAuthorizationCancelled"),

        /**
         * CheckoutPaymentAuthorizationFailed
         */
        CHECKOUT_PAYMENT_AUTHORIZATION_FAILED("CheckoutPaymentAuthorizationFailed"),

        /**
         * CheckoutPaymentAuthorized
         */
        CHECKOUT_PAYMENT_AUTHORIZED("CheckoutPaymentAuthorized"),

        /**
         * CheckoutPaymentCancelAuthorizationFailed
         */
        CHECKOUT_PAYMENT_CANCEL_AUTHORIZATION_FAILED("CheckoutPaymentCancelAuthorizationFailed"),

        /**
         * CheckoutPaymentCharged
         */
        CHECKOUT_PAYMENT_CHARGED("CheckoutPaymentCharged"),

        /**
         * CheckoutPaymentChargeFailed
         */
        CHECKOUT_PAYMENT_CHARGE_FAILED("CheckoutPaymentChargeFailed"),

        /**
         * CheckoutPaymentRefunded
         */
        CHECKOUT_PAYMENT_REFUNDED("CheckoutPaymentRefunded"),

        /**
         * CheckoutPaymentRefundFailed
         */
        CHECKOUT_PAYMENT_REFUND_FAILED("CheckoutPaymentRefundFailed"),

        /**
         * ImportContainerCreated
         */
        IMPORT_CONTAINER_CREATED("ImportContainerCreated"),

        /**
         * ImportContainerDeleted
         */
        IMPORT_CONTAINER_DELETED("ImportContainerDeleted"),

        /**
         * ImportOperationRejected
         */
        IMPORT_OPERATION_REJECTED("ImportOperationRejected"),

        /**
         * ImportUnresolved
         */
        IMPORT_UNRESOLVED("ImportUnresolved"),

        /**
         * ImportValidationFailed
         */
        IMPORT_VALIDATION_FAILED("ImportValidationFailed"),

        /**
         * ImportWaitForMasterVariant
         */
        IMPORT_WAIT_FOR_MASTER_VARIANT("ImportWaitForMasterVariant");
        private final String jsonName;

        private EventTypeEnum(final String jsonName) {
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
     * factory method for a enum value of EventType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static EventType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new EventType() {
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
    public static Optional<EventType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static EventType[] values() {
        return EventTypeEnum.values();
    }

}
