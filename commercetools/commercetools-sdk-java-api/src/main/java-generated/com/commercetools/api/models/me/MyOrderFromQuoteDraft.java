
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MyOrderFromQuoteDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyOrderFromQuoteDraft myOrderFromQuoteDraft = MyOrderFromQuoteDraft.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyOrderFromQuoteDraftImpl.class)
public interface MyOrderFromQuoteDraft extends io.vrap.rmf.base.client.Draft<MyOrderFromQuoteDraft> {

    /**
     *  <p><code>id</code> of the Quote from which the Order is created.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current <code>version</code> of the Quote from which the Order is created.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Set to <code>true</code>, if the <code>quoteState</code> of the referenced Quote should be set to <code>Accepted</code>.</p>
     * @return quoteStateToAccepted
     */

    @JsonProperty("quoteStateToAccepted")
    public Boolean getQuoteStateToAccepted();

    /**
     *  <p><code>id</code> of the Quote from which the Order is created.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current <code>version</code> of the Quote from which the Order is created.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Set to <code>true</code>, if the <code>quoteState</code> of the referenced Quote should be set to <code>Accepted</code>.</p>
     * @param quoteStateToAccepted value to be set
     */

    public void setQuoteStateToAccepted(final Boolean quoteStateToAccepted);

    /**
     * factory method
     * @return instance of MyOrderFromQuoteDraft
     */
    public static MyOrderFromQuoteDraft of() {
        return new MyOrderFromQuoteDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyOrderFromQuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyOrderFromQuoteDraft of(final MyOrderFromQuoteDraft template) {
        MyOrderFromQuoteDraftImpl instance = new MyOrderFromQuoteDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setQuoteStateToAccepted(template.getQuoteStateToAccepted());
        return instance;
    }

    public MyOrderFromQuoteDraft copyDeep();

    /**
     * factory method to create a deep copy of MyOrderFromQuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyOrderFromQuoteDraft deepCopy(@Nullable final MyOrderFromQuoteDraft template) {
        if (template == null) {
            return null;
        }
        MyOrderFromQuoteDraftImpl instance = new MyOrderFromQuoteDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setQuoteStateToAccepted(template.getQuoteStateToAccepted());
        return instance;
    }

    /**
     * builder factory method for MyOrderFromQuoteDraft
     * @return builder
     */
    public static MyOrderFromQuoteDraftBuilder builder() {
        return MyOrderFromQuoteDraftBuilder.of();
    }

    /**
     * create builder for MyOrderFromQuoteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyOrderFromQuoteDraftBuilder builder(final MyOrderFromQuoteDraft template) {
        return MyOrderFromQuoteDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyOrderFromQuoteDraft(Function<MyOrderFromQuoteDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyOrderFromQuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyOrderFromQuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyOrderFromQuoteDraft>";
            }
        };
    }
}
