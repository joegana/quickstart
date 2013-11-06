
package com.jboss.jbosstm.xts.demo.theatre;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-hudson-182-RC1
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "TheatreServiceATService", targetNamespace = "http://www.jboss.com/jbosstm/xts/demo/Theatre", wsdlLocation = "/WEB-INF/wsdl/TheatreServiceAT.wsdl")
public class TheatreServiceATService
    extends Service
{

    private final static URL THEATRESERVICEATSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.jboss.jbosstm.xts.demo.theatre.TheatreServiceATService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.jboss.jbosstm.xts.demo.theatre.TheatreServiceATService.class.getResource(".");
            url = new URL(baseUrl, "/WEB-INF/wsdl/TheatreServiceAT.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: '/WEB-INF/wsdl/TheatreServiceAT.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        THEATRESERVICEATSERVICE_WSDL_LOCATION = url;
    }

    public TheatreServiceATService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TheatreServiceATService() {
        super(THEATRESERVICEATSERVICE_WSDL_LOCATION, new QName("http://www.jboss.com/jbosstm/xts/demo/Theatre", "TheatreServiceATService"));
    }

    /**
     * 
     * @return
     *     returns ITheatreServiceAT
     */
    @WebEndpoint(name = "TheatreServiceAT")
    public ITheatreServiceAT getTheatreServiceAT() {
        return super.getPort(new QName("http://www.jboss.com/jbosstm/xts/demo/Theatre", "TheatreServiceAT"), ITheatreServiceAT.class);
    }

}