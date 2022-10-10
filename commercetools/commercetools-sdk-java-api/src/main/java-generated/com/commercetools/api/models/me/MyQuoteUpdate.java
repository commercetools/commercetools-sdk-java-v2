
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     *  <p>Expected version of the Quote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyQuoteUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final MyQuoteUpdateAction... actions);

    public void setActions(final List<MyQuoteUpdateAction> actions);

    public static MyQuoteUpdate of() {
        return new MyQuoteUpdateImpl();
    }

    public static MyQuoteUpdate of(final MyQuoteUpdate template) {
        MyQuoteUpdateImpl instance = new MyQuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyQuoteUpdateBuilder builder() {
        return MyQuoteUpdateBuilder.of();
    }

    public static MyQuoteUpdateBuilder builder(final MyQuoteUpdate template) {
        return MyQuoteUpdateBuilder.of(template);
    }

    default <T> T withMyQuoteUpdate(Function<MyQuoteUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteUpdate>";
            }
        };
    }
}
