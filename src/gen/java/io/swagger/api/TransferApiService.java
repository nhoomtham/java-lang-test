package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse200;
import io.swagger.model.ErrorModel;
import io.swagger.model.Transfer;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-12T18:02:25.374Z")
public abstract class TransferApiService {
  
      public abstract Response createTransfer(String xref,String recipient,Integer amount,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response findTransferById(String id,SecurityContext securityContext)
      throws NotFoundException;
  
}
