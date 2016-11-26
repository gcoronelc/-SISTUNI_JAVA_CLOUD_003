package pe.egcc.eurekaapp.controller;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import pe.egcc.eurekaapp.model.Cliente;
import pe.egcc.eurekaapp.service.espec.ClienteServiceEspec;
import pe.egcc.eurekaapp.service.impl.ClienteServiceImpl;

@ManagedBean
@ViewScoped
public class ClienteController implements Serializable {

	private static final long serialVersionUID = 1L;
	private Cliente clienteBean;
	private Cliente clienteCriterio;
	private List<Cliente> listaClientes;

	@PostConstruct
	public void initBean() {
		clienteBean = new Cliente();
		clienteCriterio = new Cliente();
		listaClientes = new ArrayList<>();
		clienteCriterio.setCodigo("");
	}

	public Cliente getClienteBean() {
		return clienteBean;
	}

	public void setClienteBean(Cliente clienteBean) {
		this.clienteBean = clienteBean;
	}

	public Cliente getClienteCriterio() {
		return clienteCriterio;
	}

	public void setClienteCriterio(Cliente clienteCriterio) {
		this.clienteCriterio = clienteCriterio;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void doConsulta() {
		System.err.println("Que pasa.");
		FacesMessage fm = null;
		try {
			ClienteServiceEspec clienteService;
			clienteService = new ClienteServiceImpl();
			System.out.println("Paterno: " + clienteCriterio.getPaterno());
			listaClientes = clienteService.traerVarios(clienteCriterio);
			if (listaClientes.isEmpty()) {
				fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Importante", "No se encontró ningun resultado.");
			}
		} catch (Exception e) {
			fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error en el proceso", e.getMessage());
		}
		if(fm != null){
			FacesContext.getCurrentInstance().addMessage(null, fm);
		}
	}

}
