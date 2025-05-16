
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
 * MyOrderFromCartDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyOrderFromCartDraft myOrderFromCartDraft = MyOrderFromCartDraft.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyOrderFromCartDraftImpl.class)
public interface MyOrderFromCartDraft extends io.vrap.rmf.base.client.Draft<MyOrderFromCartDraft> {

    /**
     *  <p><code>id</code> of the Cart from which the Order is created.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current <code>version</code> of the Cart from which the Order is created.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p><code>id</code> of the Cart from which the Order is created.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current <code>version</code> of the Cart from which the Order is created.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * factory method
     * @return instance of MyOrderFromCartDraft
     */
    public static MyOrderFromCartDraft of() {
        return new MyOrderFromCartDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyOrderFromCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyOrderFromCartDraft of(final MyOrderFromCartDraft template) {
        MyOrderFromCartDraftImpl instance = new MyOrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public MyOrderFromCartDraft copyDeep();

    /**
     * factory method to create a deep copy of MyOrderFromCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyOrderFromCartDraft deepCopy(@Nullable final MyOrderFromCartDraft template) {
        if (template == null) {
            return null;
        }
        MyOrderFromCartDraftImpl instance = new MyOrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * builder factory method for MyOrderFromCartDraft
     * @return builder
     */
    public static MyOrderFromCartDraftBuilder builder() {
        return MyOrderFromCartDraftBuilder.of();
    }

    /**
     * create builder for MyOrderFromCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyOrderFromCartDraftBuilder builder(final MyOrderFromCartDraft template) {
        return MyOrderFromCartDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyOrderFromCartDraft(Function<MyOrderFromCartDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyOrderFromCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyOrderFromCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyOrderFromCartDraft>";
            }
        };
    }
}
