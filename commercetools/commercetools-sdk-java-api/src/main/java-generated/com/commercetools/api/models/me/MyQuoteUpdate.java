
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteUpdate myQuoteUpdate = MyQuoteUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyQuoteUpdateImpl.class)
public interface MyQuoteUpdate
        extends com.commercetools.api.models.ResourceUpdate<MyQuoteUpdate, MyQuoteUpdateAction, MyQuoteUpdateBuilder> {

    /**
     *  <p>Expected version of the Quote to which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyQuoteUpdateAction> getActions();

    /**
     *  <p>Expected version of the Quote to which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final MyQuoteUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions values to be set
     */

    public void setActions(final List<MyQuoteUpdateAction> actions);

    /**
     * factory method
     * @return instance of MyQuoteUpdate
     */
    public static MyQuoteUpdate of() {
        return new MyQuoteUpdateImpl();
    }

    /**
     * factory method to create a shallow copy MyQuoteUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyQuoteUpdate of(final MyQuoteUpdate template) {
        MyQuoteUpdateImpl instance = new MyQuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyQuoteUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyQuoteUpdate deepCopy(@Nullable final MyQuoteUpdate template) {
        if (template == null) {
            return null;
        }
        MyQuoteUpdateImpl instance = new MyQuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.me.MyQuoteUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyQuoteUpdate
     * @return builder
     */
    public static MyQuoteUpdateBuilder builder() {
        return MyQuoteUpdateBuilder.of();
    }

    /**
     * create builder for MyQuoteUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteUpdateBuilder builder(final MyQuoteUpdate template) {
        return MyQuoteUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyQuoteUpdate(Function<MyQuoteUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteUpdate>";
            }
        };
    }
}
