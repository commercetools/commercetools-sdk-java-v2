
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Unique identifier of the Quote from which the Order is created.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
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

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setQuoteStateToAccepted(final Boolean quoteStateToAccepted);

    public static MyOrderFromQuoteDraft of() {
        return new MyOrderFromQuoteDraftImpl();
    }

    public static MyOrderFromQuoteDraft of(final MyOrderFromQuoteDraft template) {
        MyOrderFromQuoteDraftImpl instance = new MyOrderFromQuoteDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setQuoteStateToAccepted(template.getQuoteStateToAccepted());
        return instance;
    }

    public static MyOrderFromQuoteDraftBuilder builder() {
        return MyOrderFromQuoteDraftBuilder.of();
    }

    public static MyOrderFromQuoteDraftBuilder builder(final MyOrderFromQuoteDraft template) {
        return MyOrderFromQuoteDraftBuilder.of(template);
    }

    default <T> T withMyOrderFromQuoteDraft(Function<MyOrderFromQuoteDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyOrderFromQuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyOrderFromQuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyOrderFromQuoteDraft>";
            }
        };
    }
}
