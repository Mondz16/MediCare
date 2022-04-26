/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare;

/**
 *
 * @author Christian
 */
public class CommunityPharmacy extends Pharmacy{
    private String communityName;
    
    public CommunityPharmacy(String communityName){
        setCommunityName(communityName);
    }
    
    public void setCommunityName(String communityName){ this.communityName = communityName;;}
    public String getCommunityName(){ return communityName;}
    
    public String toString(){
        return communityName + "\n" + super.toString();
    }
}
