
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * Message
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Message message = Message.addDiscountCodeErrorBuilder()
 *             severity("{severity}")
 *             message("{message}")
 *             correlationId("{correlationId}")
 *             payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = MessageImpl.class, visible = true)
@JsonDeserialize(as = MessageImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Message {

    /**
     *  <p>Message code for the event.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Severity level of the event. Can be <code>info</code>, <code>warn</code>, or <code>error</code>.</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Human-readable description of the event.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>Severity level of the event. Can be <code>info</code>, <code>warn</code>, or <code>error</code>.</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Human-readable description of the event.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    public Message copyDeep();

    /**
     * factory method to create a deep copy of Message
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Message deepCopy(@Nullable final Message template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof MessageImpl)) {
            return template.copyDeep();
        }
        MessageImpl instance = new MessageImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder for addDiscountCodeError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.AddDiscountCodeErrorBuilder addDiscountCodeErrorBuilder() {
        return com.commercetools.checkout.models.responses.AddDiscountCodeErrorBuilder.of();
    }

    /**
     * builder for applicationDisabled subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ApplicationDeactivatedBuilder applicationDisabledBuilder() {
        return com.commercetools.checkout.models.responses.ApplicationDeactivatedBuilder.of();
    }

    /**
     * builder for invalidFields subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.BadInputDataBuilder invalidFieldsBuilder() {
        return com.commercetools.checkout.models.responses.BadInputDataBuilder.of();
    }

    /**
     * builder for cartEmptiedDuringCheckout subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CartEmptiedDuringCheckoutBuilder cartEmptiedDuringCheckoutBuilder() {
        return com.commercetools.checkout.models.responses.CartEmptiedDuringCheckoutBuilder.of();
    }

    /**
     * builder for cartEmpty subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CartEmptyBuilder cartEmptyBuilder() {
        return com.commercetools.checkout.models.responses.CartEmptyBuilder.of();
    }

    /**
     * builder for cartNotFound subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CartNotFoundBuilder cartNotFoundBuilder() {
        return com.commercetools.checkout.models.responses.CartNotFoundBuilder.of();
    }

    /**
     * builder for cartWithExistingPayment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CartWithExistingPaymentBuilder cartWithExistingPaymentBuilder() {
        return com.commercetools.checkout.models.responses.CartWithExistingPaymentBuilder.of();
    }

    /**
     * builder for checkoutCancelled subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CheckoutCancelledBuilder checkoutCancelledBuilder() {
        return com.commercetools.checkout.models.responses.CheckoutCancelledBuilder.of();
    }

    /**
     * builder for checkoutCompleted subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CheckoutCompletedBuilder checkoutCompletedBuilder() {
        return com.commercetools.checkout.models.responses.CheckoutCompletedBuilder.of();
    }

    /**
     * builder for checkoutLoaded subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CheckoutLoadedBuilder checkoutLoadedBuilder() {
        return com.commercetools.checkout.models.responses.CheckoutLoadedBuilder.of();
    }

    /**
     * builder for checkoutStarted subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.CheckoutStartedBuilder checkoutStartedBuilder() {
        return com.commercetools.checkout.models.responses.CheckoutStartedBuilder.of();
    }

    /**
     * builder for connectorError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ConnectorErrorBuilder connectorErrorBuilder() {
        return com.commercetools.checkout.models.responses.ConnectorErrorBuilder.of();
    }

    /**
     * builder for deprecatedFields subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.DeprecatedFieldsBuilder deprecatedFieldsBuilder() {
        return com.commercetools.checkout.models.responses.DeprecatedFieldsBuilder.of();
    }

    /**
     * builder for discountCodeNotApplicable subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.DiscountCodeNotApplicableBuilder discountCodeNotApplicableBuilder() {
        return com.commercetools.checkout.models.responses.DiscountCodeNotApplicableBuilder.of();
    }

    /**
     * builder for errorLoadingAllPaymentIntegrations subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ErrorLoadingAllPaymentIntegrationsBuilder errorLoadingAllPaymentIntegrationsBuilder() {
        return com.commercetools.checkout.models.responses.ErrorLoadingAllPaymentIntegrationsBuilder.of();
    }

    /**
     * builder for expiredSession subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ExpiredSessionBuilder expiredSessionBuilder() {
        return com.commercetools.checkout.models.responses.ExpiredSessionBuilder.of();
    }

    /**
     * builder for externalTermsAndConditionsPending subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ExternalTermsAndConditionsPendingBuilder externalTermsAndConditionsPendingBuilder() {
        return com.commercetools.checkout.models.responses.ExternalTermsAndConditionsPendingBuilder.of();
    }

    /**
     * builder for failedToRefreshSession subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.FailedToRefreshSessionBuilder failedToRefreshSessionBuilder() {
        return com.commercetools.checkout.models.responses.FailedToRefreshSessionBuilder.of();
    }

    /**
     * builder for giftCardBalanceError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.GiftCardBalanceErrorBuilder giftCardBalanceErrorBuilder() {
        return com.commercetools.checkout.models.responses.GiftCardBalanceErrorBuilder.of();
    }

    /**
     * builder for giftCardBalanceRemoved subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.GiftCardBalanceRemovedBuilder giftCardBalanceRemovedBuilder() {
        return com.commercetools.checkout.models.responses.GiftCardBalanceRemovedBuilder.of();
    }

    /**
     * builder for giftCardBalanceStarted subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.GiftCardBalanceStartedBuilder giftCardBalanceStartedBuilder() {
        return com.commercetools.checkout.models.responses.GiftCardBalanceStartedBuilder.of();
    }

    /**
     * builder for giftCardBalanceSuccess subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.GiftCardBalanceSuccessBuilder giftCardBalanceSuccessBuilder() {
        return com.commercetools.checkout.models.responses.GiftCardBalanceSuccessBuilder.of();
    }

    /**
     * builder for giftCardRedeemError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.GiftCardRedeemErrorBuilder giftCardRedeemErrorBuilder() {
        return com.commercetools.checkout.models.responses.GiftCardRedeemErrorBuilder.of();
    }

    /**
     * builder for giftCardRedeemStarted subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.GiftCardRedeemStartedBuilder giftCardRedeemStartedBuilder() {
        return com.commercetools.checkout.models.responses.GiftCardRedeemStartedBuilder.of();
    }

    /**
     * builder for giftCardRedeemSuccess subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.GiftCardRedeemSuccessBuilder giftCardRedeemSuccessBuilder() {
        return com.commercetools.checkout.models.responses.GiftCardRedeemSuccessBuilder.of();
    }

    /**
     * builder for initError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.InitErrorBuilder initErrorBuilder() {
        return com.commercetools.checkout.models.responses.InitErrorBuilder.of();
    }

    /**
     * builder for initTimeout subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.InitTimeoutBuilder initTimeoutBuilder() {
        return com.commercetools.checkout.models.responses.InitTimeoutBuilder.of();
    }

    /**
     * builder for invalidLocale subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.InvalidLocaleBuilder invalidLocaleBuilder() {
        return com.commercetools.checkout.models.responses.InvalidLocaleBuilder.of();
    }

    /**
     * builder for invalidMode subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.InvalidModeBuilder invalidModeBuilder() {
        return com.commercetools.checkout.models.responses.InvalidModeBuilder.of();
    }

    /**
     * builder for multipleVendorButtonContainers subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.MultipleVendorButtonContainersBuilder multipleVendorButtonContainersBuilder() {
        return com.commercetools.checkout.models.responses.MultipleVendorButtonContainersBuilder.of();
    }

    /**
     * builder for noPaymentIntegrations subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.NoPaymentIntegrationsBuilder noPaymentIntegrationsBuilder() {
        return com.commercetools.checkout.models.responses.NoPaymentIntegrationsBuilder.of();
    }

    /**
     * builder for noShippingMethods subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.NoShippingMethodsBuilder noShippingMethodsBuilder() {
        return com.commercetools.checkout.models.responses.NoShippingMethodsBuilder.of();
    }

    /**
     * builder for nonOrderableCartError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.NonOrderableCartErrorBuilder nonOrderableCartErrorBuilder() {
        return com.commercetools.checkout.models.responses.NonOrderableCartErrorBuilder.of();
    }

    /**
     * builder for notApplicableDiscountCodeRemoved subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.NotApplicableDiscountCodeRemovedBuilder notApplicableDiscountCodeRemovedBuilder() {
        return com.commercetools.checkout.models.responses.NotApplicableDiscountCodeRemovedBuilder.of();
    }

    /**
     * builder for orderCreated subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.OrderCreatedBuilder orderCreatedBuilder() {
        return com.commercetools.checkout.models.responses.OrderCreatedBuilder.of();
    }

    /**
     * builder for orderCreationError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.OrderCreationErrorBuilder orderCreationErrorBuilder() {
        return com.commercetools.checkout.models.responses.OrderCreationErrorBuilder.of();
    }

    /**
     * builder for orderVerificationRetryError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.OrderVerificationRetryErrorBuilder orderVerificationRetryErrorBuilder() {
        return com.commercetools.checkout.models.responses.OrderVerificationRetryErrorBuilder.of();
    }

    /**
     * builder for orderVerificationStarted subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.OrderVerificationStartedBuilder orderVerificationStartedBuilder() {
        return com.commercetools.checkout.models.responses.OrderVerificationStartedBuilder.of();
    }

    /**
     * builder for orderVerificationTimeout subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.OrderVerificationTimeoutBuilder orderVerificationTimeoutBuilder() {
        return com.commercetools.checkout.models.responses.OrderVerificationTimeoutBuilder.of();
    }

    /**
     * builder for paymentCancelled subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentCancelledBuilder paymentCancelledBuilder() {
        return com.commercetools.checkout.models.responses.PaymentCancelledBuilder.of();
    }

    /**
     * builder for paymentFailed subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentFailedBuilder paymentFailedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentFailedBuilder.of();
    }

    /**
     * builder for paymentIntegrationLoaded subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationLoadedBuilder paymentIntegrationLoadedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationLoadedBuilder.of();
    }

    /**
     * builder for paymentIntegrationLoading subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationLoadingBuilder paymentIntegrationLoadingBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationLoadingBuilder.of();
    }

    /**
     * builder for paymentIntegrationLoadingError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationLoadingErrorBuilder paymentIntegrationLoadingErrorBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationLoadingErrorBuilder.of();
    }

    /**
     * builder for paymentIntegrationNotAvailable subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationNotAvailableBuilder paymentIntegrationNotAvailableBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationNotAvailableBuilder.of();
    }

    /**
     * builder for paymentIntegrationSelected subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationSelectedBuilder paymentIntegrationSelectedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationSelectedBuilder.of();
    }

    /**
     * builder for paymentIntegrationSelectionConfirmation subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationSelectionConfirmationBuilder paymentIntegrationSelectionConfirmationBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationSelectionConfirmationBuilder.of();
    }

    /**
     * builder for paymentIntegrationSelectionConfirmationFailed subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationSelectionConfirmationFailedBuilder paymentIntegrationSelectionConfirmationFailedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationSelectionConfirmationFailedBuilder.of();
    }

    /**
     * builder for paymentIntegrationsReceived subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentIntegrationsReceivedBuilder paymentIntegrationsReceivedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentIntegrationsReceivedBuilder.of();
    }

    /**
     * builder for paymentStarted subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentStartedBuilder paymentStartedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentStartedBuilder.of();
    }

    /**
     * builder for paymentValidationFailed subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentValidationFailedBuilder paymentValidationFailedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentValidationFailedBuilder.of();
    }

    /**
     * builder for paymentValidationPassed subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentValidationPassedBuilder paymentValidationPassedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentValidationPassedBuilder.of();
    }

    /**
     * builder for paymentValidationStarted subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.PaymentValidationStartedBuilder paymentValidationStartedBuilder() {
        return com.commercetools.checkout.models.responses.PaymentValidationStartedBuilder.of();
    }

    /**
     * builder for projectDeactivated subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ProjectIsDeactivatedBuilder projectDeactivatedBuilder() {
        return com.commercetools.checkout.models.responses.ProjectIsDeactivatedBuilder.of();
    }

    /**
     * builder for removeDiscountCodeError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.RemoveDiscountCodeErrorBuilder removeDiscountCodeErrorBuilder() {
        return com.commercetools.checkout.models.responses.RemoveDiscountCodeErrorBuilder.of();
    }

    /**
     * builder for setShippingAddressError subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.SetShippingAddressErrorBuilder setShippingAddressErrorBuilder() {
        return com.commercetools.checkout.models.responses.SetShippingAddressErrorBuilder.of();
    }

    /**
     * builder for shippingAddressMissing subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ShippingAddressMissingErrorBuilder shippingAddressMissingBuilder() {
        return com.commercetools.checkout.models.responses.ShippingAddressMissingErrorBuilder.of();
    }

    /**
     * builder for shippingMethodDoesNotMatchCart subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ShippingMethodDoesNotMatchCartBuilder shippingMethodDoesNotMatchCartBuilder() {
        return com.commercetools.checkout.models.responses.ShippingMethodDoesNotMatchCartBuilder.of();
    }

    /**
     * builder for shippingMethodSelected subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ShippingMethodSelectedBuilder shippingMethodSelectedBuilder() {
        return com.commercetools.checkout.models.responses.ShippingMethodSelectedBuilder.of();
    }

    /**
     * builder for shippingMethodSelectionConfirmation subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.ShippingMethodSelectionConfirmationBuilder shippingMethodSelectionConfirmationBuilder() {
        return com.commercetools.checkout.models.responses.ShippingMethodSelectionConfirmationBuilder.of();
    }

    /**
     * builder for unavailableLocale subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.UnavailableLocaleBuilder unavailableLocaleBuilder() {
        return com.commercetools.checkout.models.responses.UnavailableLocaleBuilder.of();
    }

    /**
     * builder for unsupportedCountry subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.UnsupportedCountryBuilder unsupportedCountryBuilder() {
        return com.commercetools.checkout.models.responses.UnsupportedCountryBuilder.of();
    }

    /**
     * builder for updatedFields subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.responses.UpdatedFieldsBuilder updatedFieldsBuilder() {
        return com.commercetools.checkout.models.responses.UpdatedFieldsBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessage(Function<Message, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Message> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Message>() {
            @Override
            public String toString() {
                return "TypeReference<Message>";
            }
        };
    }
}
