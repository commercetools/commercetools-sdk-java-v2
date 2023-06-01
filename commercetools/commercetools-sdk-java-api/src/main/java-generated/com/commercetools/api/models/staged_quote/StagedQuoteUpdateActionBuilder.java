package com.commercetools.api.models.staged_quote;

import com.commercetools.api.models.staged_quote.StagedQuoteChangeStagedQuoteStateAction;
import com.commercetools.api.models.staged_quote.StagedQuoteSetCustomFieldAction;
import com.commercetools.api.models.staged_quote.StagedQuoteSetCustomTypeAction;
import com.commercetools.api.models.staged_quote.StagedQuoteSetSellerCommentAction;
import com.commercetools.api.models.staged_quote.StagedQuoteSetValidToAction;
import com.commercetools.api.models.staged_quote.StagedQuoteTransitionStateAction;
import com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteUpdateActionBuilder {

    public com.commercetools.api.models.staged_quote.StagedQuoteChangeStagedQuoteStateActionBuilder changeStagedQuoteStateBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteChangeStagedQuoteStateActionBuilder.of();
    }
    public com.commercetools.api.models.staged_quote.StagedQuoteSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.staged_quote.StagedQuoteSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.staged_quote.StagedQuoteSetSellerCommentActionBuilder setSellerCommentBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteSetSellerCommentActionBuilder.of();
    }
    public com.commercetools.api.models.staged_quote.StagedQuoteSetValidToActionBuilder setValidToBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteSetValidToActionBuilder.of();
    }
    public com.commercetools.api.models.staged_quote.StagedQuoteTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteTransitionStateActionBuilder.of();
    }

    /**
     * factory method for an instance of StagedQuoteUpdateActionBuilder
     * @return builder 
     */
    public static StagedQuoteUpdateActionBuilder of() {
        return new StagedQuoteUpdateActionBuilder();
    }

}
