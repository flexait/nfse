/**
 * NfseSOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.flexait.nfse.ws;

public class NfseSOAPStub extends org.apache.axis.client.Stub implements br.com.flexait.nfse.ws.Nfse {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelarNfse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "CancelarNfseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "CancelarNfseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarLoteRps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarLoteRpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarLoteRpsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarNfseServicoPrestado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfseServicoPrestadoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfseServicoPrestadoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarNfseServicoTomado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfseServicoTomadoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfseServicoTomadoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarNfsePorFaixa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfsePorFaixaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfsePorFaixaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarNfsePorRps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfsePorRpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "ConsultarNfsePorRpsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RecepcionarLoteRps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "RecepcionarLoteRpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "RecepcionarLoteRpsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GerarNfse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "GerarNfseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "GerarNfseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubstituirNfse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "SubstituirNfseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "SubstituirNfseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RecepcionarLoteRpsSincrono");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "RecepcionarLoteRpsSincronoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input"), br.com.flexait.nfse.ws.Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output"));
        oper.setReturnClass(br.com.flexait.nfse.ws.Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "RecepcionarLoteRpsSincronoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public NfseSOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NfseSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NfseSOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "input");
            cachedSerQNames.add(qName);
            cls = br.com.flexait.nfse.ws.Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "output");
            cachedSerQNames.add(qName);
            cls = br.com.flexait.nfse.ws.Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.flexait.nfse.ws.Output cancelarNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/CancelarNfse");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CancelarNfse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output consultarLoteRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/ConsultarLoteRps");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConsultarLoteRps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output consultarNfseServicoPrestado(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/ConsultarNfseServicoPrestado");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConsultarNfseServicoPrestado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output consultarNfseServicoTomado(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/ConsultarNfseServicoTomado");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConsultarNfseServicoTomado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output consultarNfsePorFaixa(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/ConsultarNfsePorFaixa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConsultarNfsePorFaixa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output consultarNfsePorRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/ConsultarNfsePorRps");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConsultarNfsePorRps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output recepcionarLoteRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/RecepcionarLoteRps");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RecepcionarLoteRps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output gerarNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/GerarNfse");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GerarNfse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output substituirNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/SubstituirNfse");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubstituirNfse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.flexait.nfse.ws.Output recepcionarLoteRpsSincrono(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nfse.abrasf.org.br/RecepcionarLoteRpsSincrono");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RecepcionarLoteRpsSincrono"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.flexait.nfse.ws.Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.flexait.nfse.ws.Output) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.flexait.nfse.ws.Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
