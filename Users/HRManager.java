//package Users;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class HRManager {
//    private List<SalesRepresentative> salesReps;
//    private List<ServiceTechnician> serviceTechs;
//
//    public HRManager() {
//        salesReps = new ArrayList<>();
//        serviceTechs = new ArrayList<>();
//    }
//
//    // Add a Sales Representative
//    public void addSalesRepresentative(SalesRepresentative rep) {
//        salesReps.add(rep);
//    }
//
//    // Remove a Sales Representative
//    public void removeSalesRepresentative(int id) {
//        salesReps.removeIf(rep -> rep.getId() == id);
//    }
//
//    // List all Sales Representatives
//    public void listSalesRepresentatives() {
//        System.out.println("Sales Representatives:");
//        for (SalesRepresentative rep : salesReps) {
//            System.out.println(rep);
//        }
//    }
//
//    // Add a Service Technician
//    public void addServiceTechnician(ServiceTechnician tech) {
//        serviceTechs.add(tech);
//    }
//
//    // Remove a Service Technician
//    public void removeServiceTechnician(int id) {
//        serviceTechs.removeIf(tech -> tech.getId() == id);
//    }
//
//    // List all Service Technicians
//    public void listServiceTechnicians() {
//        System.out.println("Service Technicians:");
//        for (ServiceTechnician tech : serviceTechs) {
//            System.out.println(tech);
//        }
//    }
//}
//  
