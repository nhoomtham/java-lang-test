package io.swagger.api.factories;

import io.swagger.api.TransferApiService;
import io.swagger.api.impl.TransferApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-12T18:02:25.374Z")
public class TransferApiServiceFactory {

   private final static TransferApiService service = new TransferApiServiceImpl();

   public static TransferApiService getTransferApi()
   {
      return service;
   }
}
