
package com.commercetools.checkout.models.payment_intents;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The possible values for a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentIntentOperation extends JsonEnum {

    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentCaptureAction" rel="nofollow">Captures</a> the given <span>Payment</span> amount.</p> */
    PaymentIntentOperation CAPTURE_PAYMENT = PaymentIntentOperationEnum.CAPTURE_PAYMENT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentRefundAction" rel="nofollow">Refunds</a> the given Payment amount.</p> */
    PaymentIntentOperation REFUND_PAYMENT = PaymentIntentOperationEnum.REFUND_PAYMENT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentCancelAction" rel="nofollow">Cancels</a> an authorized Payment.</p> */
    PaymentIntentOperation CANCEL_PAYMENT = PaymentIntentOperationEnum.CANCEL_PAYMENT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentReverseAction" rel="nofollow">Reverses</a> a Payment.</p> */
    PaymentIntentOperation REVERSE_PAYMENT = PaymentIntentOperationEnum.REVERSE_PAYMENT;

    /**
     * possible values of PaymentIntentOperation
     */
    enum PaymentIntentOperationEnum implements PaymentIntentOperation {
        /**
         * capturePayment
         */
        CAPTURE_PAYMENT("capturePayment"),

        /**
         * refundPayment
         */
        REFUND_PAYMENT("refundPayment"),

        /**
         * cancelPayment
         */
        CANCEL_PAYMENT("cancelPayment"),

        /**
         * reversePayment
         */
        REVERSE_PAYMENT("reversePayment");
        private final String jsonName;

        private PaymentIntentOperationEnum(final String jsonName) {
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
     * factory method for a enum value of PaymentIntentOperation
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static PaymentIntentOperation findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new PaymentIntentOperation() {
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
    public static Optional<PaymentIntentOperation> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static PaymentIntentOperation[] values() {
        return PaymentIntentOperationEnum.values();
    }

}
