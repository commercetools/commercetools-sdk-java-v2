package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.common.CentPrecisionMoneyDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CentPrecisionMoneyDraftImpl.class)
public interface CentPrecisionMoneyDraft extends TypedMoneyDraft {



   public static CentPrecisionMoneyDraftImpl of(){
      return new CentPrecisionMoneyDraftImpl();
   }


   public static CentPrecisionMoneyDraftImpl of(final CentPrecisionMoneyDraft template) {
      CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
      instance.setCentAmount(template.getCentAmount());
      instance.setCurrencyCode(template.getCurrencyCode());
      return instance;
   }

}
