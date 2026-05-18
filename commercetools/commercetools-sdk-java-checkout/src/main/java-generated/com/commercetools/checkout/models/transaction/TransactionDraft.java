
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.application.ApplicationResourceIdentifier;
import com.commercetools.checkout.models.cart.CartResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TransactionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionDraft transactionDraft = TransactionDraft.builder()
 *             .application(applicationBuilder -> applicationBuilder)
 *             .plusTransactionItems(transactionItemsBuilder -> transactionItemsBuilder)
 *             .cart(cartBuilder -> cartBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionDraftImpl.class)
public interface TransactionDraft extends io.vrap.rmf.base.client.Draft<TransactionDraft> {

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment is executed.</p>
     * @return application
     */
    @NotNull
    @Valid
    @JsonProperty("application")
    public ApplicationResourceIdentifier getApplication();

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @return transactionItems
     */
    @NotNull
    @Valid
    @JsonProperty("transactionItems")
    public List<TransactionItemDraft> getTransactionItems();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> for which the payment must be executed.</p>
     * @return cart
     */
    @NotNull
    @Valid
    @JsonProperty("cart")
    public CartResourceIdentifier getCart();

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment is executed.</p>
     * @param application value to be set
     */

    public void setApplication(final ApplicationResourceIdentifier application);

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems values to be set
     */

    @JsonIgnore
    public void setTransactionItems(final TransactionItemDraft... transactionItems);

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems values to be set
     */

    public void setTransactionItems(final List<TransactionItemDraft> transactionItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> for which the payment must be executed.</p>
     * @param cart value to be set
     */

    public void setCart(final CartResourceIdentifier cart);

    /**
     * factory method
     * @return instance of TransactionDraft
     */
    public static TransactionDraft of() {
        return new TransactionDraftImpl();
    }

    /**
     * factory method to create a shallow copy TransactionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionDraft of(final TransactionDraft template) {
        TransactionDraftImpl instance = new TransactionDraftImpl();
        instance.setKey(template.getKey());
        instance.setApplication(template.getApplication());
        instance.setTransactionItems(template.getTransactionItems());
        instance.setCart(template.getCart());
        return instance;
    }

    public TransactionDraft copyDeep();

    /**
     * factory method to create a deep copy of TransactionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionDraft deepCopy(@Nullable final TransactionDraft template) {
        if (template == null) {
            return null;
        }
        TransactionDraftImpl instance = new TransactionDraftImpl();
        instance.setKey(template.getKey());
        instance.setApplication(com.commercetools.checkout.models.application.ApplicationResourceIdentifier
                .deepCopy(template.getApplication()));
        instance.setTransactionItems(Optional.ofNullable(template.getTransactionItems())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.transaction.TransactionItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCart(com.commercetools.checkout.models.cart.CartResourceIdentifier.deepCopy(template.getCart()));
        return instance;
    }

    /**
     * builder factory method for TransactionDraft
     * @return builder
     */
    public static TransactionDraftBuilder builder() {
        return TransactionDraftBuilder.of();
    }

    /**
     * create builder for TransactionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionDraftBuilder builder(final TransactionDraft template) {
        return TransactionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionDraft(Function<TransactionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransactionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionDraft>";
            }
        };
    }
}
