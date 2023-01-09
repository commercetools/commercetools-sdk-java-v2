
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextLineItemDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextLineItemDraft textLineItemDraft = TextLineItemDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TextLineItemDraftImpl.class)
public interface TextLineItemDraft extends com.commercetools.api.models.CustomizableDraft<TextLineItemDraft>,
        io.vrap.rmf.base.client.Draft<TextLineItemDraft> {

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields for the TextLineItem.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Description of the TextLineItem.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Name of the TextLineItem.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public void setDescription(final LocalizedString description);

    public void setName(final LocalizedString name);

    public void setQuantity(final Long quantity);

    public static TextLineItemDraft of() {
        return new TextLineItemDraftImpl();
    }

    public static TextLineItemDraft of(final TextLineItemDraft template) {
        TextLineItemDraftImpl instance = new TextLineItemDraftImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDescription(template.getDescription());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static TextLineItemDraftBuilder builder() {
        return TextLineItemDraftBuilder.of();
    }

    public static TextLineItemDraftBuilder builder(final TextLineItemDraft template) {
        return TextLineItemDraftBuilder.of(template);
    }

    default <T> T withTextLineItemDraft(Function<TextLineItemDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TextLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TextLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TextLineItemDraft>";
            }
        };
    }
}
