package com.macormap.gattinoni;

/**
 * Created by carlo on 08/11/2017.
 */

public class Prodotto {

    private String desc_1;
    private String desc_2;
    private int iddoImg1r;
    private int iddoImg2r;
    private int iddoImg1;
    private int iddoImg2;


    public Prodotto() {}

    public Prodotto(int cat,int subcat1, int cod1, int subcat2,  int cod2) {
      this.desc_1 = desco(cat,subcat1,cod1);
      this.desc_2 = desco(cat,subcat2,cod2);
      this.iddoImg1r = immoImg(cat,subcat1,cod1,true);
      this.iddoImg2r = immoImg(cat,subcat2,cod2,true);
      this.iddoImg1 = immoImg(cat,subcat1,cod1,false);
      this.iddoImg2 = immoImg(cat,subcat2,cod2,false);
    }


    public Prodotto(String desc1, String desc2) {
        this.desc_1 = desc1;
        this.desc_2 = desc2;
    }

    public String getDecr_1() {
        return desc_1;
    }

    public String getDecr_2() {
        return desc_2;
    }

    public int gettoIdImg_1() { return iddoImg1; }

    public int gettoIdImg_2() { return iddoImg2; }

    public int gettoIdImg_1r() { return iddoImg1r; }

    public int gettoIdImg_2r() { return iddoImg2r; }



    private String descoCollezione_1(int subcat, int cod) {
        String res = "";
        switch (subcat) {
                case 1 : // pantaloni
                    switch (cod) {
                        case 1 : res = "SCAMPANATO";      break;
                        case 2 : res = "SCAMPANATO";      break;
                        case 3 : res = "SCAMPANATO";      break;
                        case 4 : res = "MORBIDO";         break;
                        case 5 : res = "JEANS LAMINATO"; break;
                    }
                    break; // pantaloni
                case 2 : // gonne
                    switch (cod) {
                        case 1 : res = "GONNA PORTAFOGLIO";      break;
                        case 2 : res = "GONNA SVASATA";      break;
                    }
                    break; // gonne
            case 3 : // camicie
                switch (cod) {
                    case 1 : res = "CAMICIA IN PIZZO";         break;
                    case 2 : res = "CAMICIA IN RIGA PEQUIN";   break;
                    case 3 : res = "CAMICIA SVASATA";   break;
                }
                break;
            case 4 : // capispalla
                switch (cod) {
                    case 1 : res = "CAPPOTTO CLOQUE";         break;
                    case 2 : res = "CAPPOTTINO";   break;
                    case 3 : res = "GIACCA A VENTO";   break;
                    case 4 : res = "CAPPOTTINO";   break;
                }
                break;
            case 5 : // abiti
                switch (cod) {
                    case 1 : res = "CLOQUE JACQUARD";         break;
                    case 2 : res = "ABITO LUNGO";   break;
                    case 3 : res = "SVASATO";   break;
                    case 4 : res = "LUNGO IN PIZZO";   break;
                    case 5 : res = "MIDI IN ENVER SATIN";   break;
                    case 6 : res = "MINI ABITO";   break;
                    case 7 : res = "IN JERSEY LUREX";   break;
                    case 8 : res = "TUTA IN JERSEY LUREX";   break;
                    case 9 : res = "GEORGETTE STAMPATA";   break;
                    case 10 : res = "ABBOTTONATURA VITA";   break;
                    case 11 : res = "BALZE SVASATO";   break;
                    case 12 : res = "SACCHETTO CON BALZA";   break;
                }
                break;
            case 6 : // giacche
                switch (cod) {
                    case 1 : res = "BOMBER";         break;
                    case 2 : res = "GIACCA";   break;
                    case 3 : res = "GIACCHINA SPENCER";   break;
                    case 4 : res = "GIACCHINA SPENCER";   break;
                    case 5 : res = "GIACCA DOPPIO PETTO";   break;
                    case 6 : res = "CHANEL JACQUARD";   break;
                    case 7 : res = "GIACCA IN JEANS";   break;
                }
                break;

            case 7 : // top bluse
                switch (cod) {
                    case 1 : res = "BLUSA IN CREPE";         break;
                    case 2 : res = "BLUSA GEORGETTE";   break;
                    case 3 : res = "BLUSA JERSEY LUREX";   break;
                    case 4 : res = "BLUSA GEORGETTE";   break;
                    case 5 : res = "BLUSA MORBIDA";   break;
                    case 6 : res = "TOP SMANICATO";   break;
                }
                break;

        }
        return res;
    }


    private String descoCollezione_2(int subcat, int cod) {
        String res = "";
        switch (subcat) {
            case 1 : // pantaloni
                switch (cod) {
                    case 1 : res = "PANTALONE";      break;
                    case 2 : res = "NEW YORK";      break;
                    case 3 : res = "PANTALONE";      break;
                    case 4 : res = "NEW YORK";         break;
                    case 5 : res = "SHORT"; break;
                    case 6 : res = "NEW YORK"; break;
                }
                break; // pantaloni
            case 2 : // gonne
                switch (cod) {
                    case 1 : res = "MAXI GONNA PIZZO";      break;
                    case 2 : res = "LONGUETTE MACRAME";      break;
                    case 3 : res = "MAXI GONNA CREPONNE";      break;
                }
                break; // gonne
            case 3 : // camicie
                switch (cod) {
                    case 1 : res = "CASACCA IN CREPE";         break;
                    case 2 : res = "BLUSA";   break;
                    case 3 : res = "BLUSA IN CREPE";   break;
                }
                break;
            case 4 : // capispalla
                switch (cod) {
                    case 1 : res = "TRENCH";         break;
                    case 2 : res = "SPOLVERINO MIKADO";   break;
                    case 3 : res = "SPOLVERINO JACQUARD";   break;
                }
                break;
            case 5 : // abiti
                switch (cod) {
                    case 1 : res = "PRINCESSE MIKADO";         break;
                    case 2 : res = "ABITO IN PIZZO";   break;
                    case 3 : res = "ABITO JACQUARD";   break;
                    case 4 : res = "ABITO STUOIA SPALMATA";   break;
                    case 5 : res = "ABITO MIKADO";   break;
                    case 6 : res = "ABITO JACQUARD";   break;
                    case 7 : res = "ABITO";   break;
                    case 8 : res = "ABITO A BALZE";   break;
                    case 9 : res = "ABITO ORGANZA";   break;
                }
                break;
            case 6 : // giacche
                switch (cod) {
                    case 1 : res = "CHANEL IN STUOIA";         break;
                    case 2 : res = "BOMBER JACKET";   break;
                    case 3 : res = "COPRISPALLE";   break;
                    case 4 : res = "CHANEL TUBICO";   break;
                    case 5 : res = "BIKER JACKET";   break;
                    case 6 : res = "JACKET JACQUARD";   break;
                    case 7 : res = "BIKER JACKET";   break;
                }
                break;

            case 7 : // top bluse
                switch (cod) {
                    case 1 : res = "TOP PIZZO MACRAME";         break;
                    case 2 : res = "TOP ORGANZA";   break;
                }
                break;

        }
        return res;
    }


    private String descoScarpe(int subcat, int cod) {
        String res ="";
        switch (subcat) {
            case 1 : // sandali
                switch (cod) {
                    case 1 : res = "MARIKA SUEDE";   break;
                }
                break; // sandali
            case 2 : // ginnic
                switch (cod) {
                    case 1 : res = "SNEAKER LAMINATA";   break;
                    case 2 : res = "VALENTINA SUEDE";   break;
                    case 3 : res = "VALENTINA PELLE";   break;
                    case 4 : res = "ANITA PAILLETTES";   break;
                    case 5 : res = "MIA PELLE";   break;
                    case 6 : res = "MIA PELLE";   break;
                    case 7 : res = "ANITA SUEDE";   break;
                    case 8 : res = "VALENTINA PELLE";   break;
                    case 9 : res = "VALENTINA PELLE";   break;
                    case 10 : res = "VALENTINA SUEDE";   break;
                }
                break; // ginnic
            case 3 : // decollette
                switch (cod) {
                    case 1 : res = "MIRTA SUEDE";   break;
                    case 2 : res = "MIRTA PELLE";   break;
                }
                break; // decollette
        }
        return res;
    }

    private String descoGiolielli(int subcat, int cod) {
        String res ="";
        switch (subcat) {
            case 1 : // minibag
                switch (cod) {
                    case 1 : res = "JEWEL BAGUETTE";   break;
                    case 2 : res = "JEWEL BUCKET";     break;
                    case 3 : res = "JEWEL BAULETTO";   break;
                    case 4 : res = "JEWEL CHANEL BAG"; break;
                    case 5 : res = "JEWEL SHOPPER";    break;
                    case 6 : res = "JEWEL FRAME BAG";  break;
                }
                break;
            case 2 : // bracciali
                switch (cod) {
                    case 1 : res = "BRACCIALE";   break;
                    case 2 : res = "BANGLE";     break;
                    case 3 : res = "BANGLE";   break;
                    case 4 : res = "BRACCIALE"; break;
                    case 5 : res = "BRACCIALE";    break;
                    case 6 : res = "BRACCIALE";  break;
                    case 7 : res = "BRACCIALE";  break;
                    case 8 : res = "BRACCIALE";  break;
                    case 9 : res = "BRACCIALE";  break;
                    case 10 : res = "BRACCIALE";  break;
                    case 11 : res = "BRACCIALE";  break;
                    case 12 : res = "BRACCIALE CIONDOLI";  break;
                    case 13 : res = "BRACCIALE CIONDOLI";  break;
                    case 14 : res = "BRACCIALE CIONDOLI";  break;
                    case 15 : res = "BRACCIALE CIONDOLI";  break;
                    case 16 : res = "BRACCIALE CIONDOLI";  break;
                    case 17 : res = "BRACCIALE CIONDOLI";  break;
                    case 18 : res = "BRACCIALE";  break;
                    case 19 : res = "BRACCIALE";  break;
                    case 20 : res = "BRACCIALE";  break;
                    case 21 : res = "BANGLE";  break;
                }
                break;

            case 3 : // collane
                switch (cod) {
                    case 1 : res = "COLLANA";   break;
                    case 2 : res = "COLLANA";     break;
                    case 3 : res = "COLLANA";   break;
                    case 4 : res = "COLLANA"; break;
                    case 5 : res = "COLLANA";    break;
                    case 6 : res = "COLLANA";  break;
                    case 7 : res = "COLLANA";  break;
                    case 8 : res = "COLLANA";  break;
                    case 9 : res = "COLLANA";  break;
                    case 10 : res = "COLLANA";  break;
                }
                break;

            case 4 : // ORECCHINI
                switch (cod) {
                    case 1 : res = "ORECCHINI";   break;
                    case 2 : res = "ORECCHINI";     break;
                    case 3 : res = "ORECCHINI";   break;
                    case 4 : res = "ORECCHINI"; break;
                    case 5 : res = "ORECCHINI";    break;
                    case 6 : res = "ORECCHINI";  break;
                    case 7 : res = "ORECCHINI";  break;
                    case 8 : res = "ORECCHINI";  break;
                    case 9 : res = "ORECCHINI";  break;
                }
                break;

        }
        return res;
    }


    private String descoPelletteria(int subcat, int cod) {
        String res = "";
        switch (subcat) {
            case 1: // borse piccole
                switch (cod) {
                    case 1:  res = "FLAT TROUSSE";  break;
                    case 2:  res = "CLUTCH";  break;
                    case 3:  res = "FLAP CROSSBODY";  break;
                    case 4:  res = "TROUSSE";  break;
                    case 5:  res = "SMALL FLAP";  break;
                }
                break;

            case 2: // piccola pelletteria
                switch (cod) {
                    case 1:  res = "SMALL ZIP";  break;
                    case 2:  res = "WOMAN BELT";  break;
                    case 3:  res = "ZIP AROUND";  break;
                    case 4:  res = "TRIFOLD";  break;
                    case 5:  res = "KEY RING";  break;
                    case 6:  res = "CLASSIC SMALL";  break;
                    case 7:  res = "KEY RING";  break;
                }
                break;

            case 3: // borse
                switch (cod) {
                    case 1:  res = "HOBO";  break;
                    case 2:  res = "SHOPPING";  break;
                    case 3:  res = "POCHETTE";  break;
                    case 4:  res = "LARGE SATCHEL";  break;
                    case 5:  res = "SQUARE SHOPPER";  break;
                    case 6:  res = "SHOPPER";  break;
                    case 7:  res = "BACKPACK";  break;
                    case 8:  res = "HANDLE FLAP";  break;
                    case 9:  res = "BUCKET";  break;
                    case 10:  res = "HOBO";  break;
                    case 11:  res = "BUCKET";  break;
                    case 12:  res = "SHOPPING";  break;
                    case 13:  res = "SHOPPER";  break;
                    case 14:  res = "SHOPPER";  break;
                    case 15:  res = "FLAP OVER";  break;
                    case 16:  res = "MESSENGER";  break;
                    case 17:  res = "MESSENGER";  break;
                    case 18:  res = "SHOPPER";  break;
                    case 19:  res = "BUCKET";  break;
                    case 20:  res = "BACKPACK";  break;
                }
                break;

        }
        return res;
    }

    private String desco(int cat,int subcat, int cod) {
      String res ="";
        switch (cat) {
            case 1 :   res = descoCollezione_1(subcat, cod);    break; // 1 abbigliamento 1

            case 2 :   res = descoCollezione_2(subcat, cod);    break; // 2 abbigliamento 2

            case 3 :  res = descoPelletteria(subcat, cod);    break; // 3 pelletteria

            case 4 :  res = descoScarpe(subcat, cod);         break; // 4 scarpe

            case 5 :  res = descoGiolielli(subcat, cod);      break; // 5 gioielli

        }
      return res;
    }



    private int immoImgScarpe(int subcat, int cod,boolean ridd) {
        int res = 0;
        switch (subcat) {
            case 1:
                switch (cod) {
                    case 1: if (ridd) {res = R.drawable.s_1_1r;} else {res = R.drawable.s_1_1; }  break;
                }
                break; //
            case 2:
                switch (cod) {
                    case 1: if (ridd) {res = R.drawable.s_2_1r;} else {res = R.drawable.s_2_1; } break;
                    case 2: if (ridd) {res = R.drawable.s_2_2r;} else {res = R.drawable.s_2_2; } break;
                    case 3: if (ridd) {res = R.drawable.s_2_3r;} else {res = R.drawable.s_2_3;  } break;
                    case 4: if (ridd) {res = R.drawable.s_2_4r;} else {res = R.drawable.s_2_4;  } break;
                    case 5: if (ridd) {res = R.drawable.s_2_5r;} else {res = R.drawable.s_2_5;  } break;
                    case 6: if (ridd) {res = R.drawable.s_2_6r;} else {res = R.drawable.s_2_6;  } break;
                    case 7: if (ridd) {res = R.drawable.s_2_7r;} else {res = R.drawable.s_2_7;  } break;
                    case 8: if (ridd) {res = R.drawable.s_2_8r;} else {res = R.drawable.s_2_8;  } break;
                    case 9: if (ridd) {res = R.drawable.s_2_9r;} else {res = R.drawable.s_2_9;  } break;
                    case 10: if (ridd) {res = R.drawable.s_2_10r;} else {res = R.drawable.s_2_10;  } break;
                }
                break; //
            case 3:
                switch (cod) {
                    case 1: if (ridd) {res = R.drawable.s_3_1r;} else {res = R.drawable.s_3_1;  } break;
                    case 2: if (ridd) {res = R.drawable.s_3_2r;} else {res = R.drawable.s_3_2;  } break;
                }
                break; //
        }
        return res;
    }

    private int immoImgGioielli(int subcat, int cod,boolean ridd) {
        int res = 0;
        switch (subcat) {

            case 1: // minibag
                switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.g_1_1r;} else {res = R.drawable.g_1_1;} break;
                        case 2:  if (ridd) {res = R.drawable.g_1_2r;} else {res = R.drawable.g_1_2;}  break;
                        case 3:  if (ridd) {res = R.drawable.g_1_3r;} else {res = R.drawable.g_1_3;}  break;
                        case 4:  if (ridd) {res = R.drawable.g_1_4r;} else {res = R.drawable.g_1_4;}  break;
                        case 5:  if (ridd) {res = R.drawable.g_1_5r;} else {res = R.drawable.g_1_5;}  break;
                        case 6:  if (ridd) {res = R.drawable.g_1_6r;} else {res = R.drawable.g_1_6;}  break;
                }
                break; // minibag

            case 2: // Bracciali
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.g_2_1r;} else {res = R.drawable.g_2_1;} break;
                    case 2:  if (ridd) {res = R.drawable.g_2_2r;} else {res = R.drawable.g_2_2;}  break;
                    case 3:  if (ridd) {res = R.drawable.g_2_3r;} else {res = R.drawable.g_2_3;}  break;
                    case 4:  if (ridd) {res = R.drawable.g_2_4r;} else {res = R.drawable.g_2_4;}  break;
                    case 5:  if (ridd) {res = R.drawable.g_2_5r;} else {res = R.drawable.g_2_5;}  break;
                    case 6:  if (ridd) {res = R.drawable.g_2_6r;} else {res = R.drawable.g_2_6;}  break;
                    case 7:  if (ridd) {res = R.drawable.g_2_7r;} else {res = R.drawable.g_2_7;}  break;
                    case 8:  if (ridd) {res = R.drawable.g_2_8r;} else {res = R.drawable.g_2_8;}  break;
                    case 9:  if (ridd) {res = R.drawable.g_2_9r;} else {res = R.drawable.g_2_9;}  break;
                    case 10:  if (ridd) {res = R.drawable.g_2_10r;} else {res = R.drawable.g_2_10;}  break;
                    case 11:  if (ridd) {res = R.drawable.g_2_11r;} else {res = R.drawable.g_2_11;}  break;
                    case 12:  if (ridd) {res = R.drawable.g_2_12r;} else {res = R.drawable.g_2_12;}  break;
                    case 13:  if (ridd) {res = R.drawable.g_2_13r;} else {res = R.drawable.g_2_13;}  break;
                    case 14:  if (ridd) {res = R.drawable.g_2_14r;} else {res = R.drawable.g_2_14;}  break;
                    case 15:  if (ridd) {res = R.drawable.g_2_15r;} else {res = R.drawable.g_2_15;}  break;
                    case 16:  if (ridd) {res = R.drawable.g_2_16r;} else {res = R.drawable.g_2_16;}  break;
                    case 17:  if (ridd) {res = R.drawable.g_2_17r;} else {res = R.drawable.g_2_17;}  break;
                    case 18:  if (ridd) {res = R.drawable.g_2_18r;} else {res = R.drawable.g_2_18;}  break;
                    case 19:  if (ridd) {res = R.drawable.g_2_19r;} else {res = R.drawable.g_2_19;}  break;
                    case 20:  if (ridd) {res = R.drawable.g_2_20r;} else {res = R.drawable.g_2_20;}  break;
                    case 21:  if (ridd) {res = R.drawable.g_2_21r;} else {res = R.drawable.g_2_21;}  break;
                }
                break; //

            case 3: // collane
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.g_3_1r;} else {res = R.drawable.g_3_1;} break;
                    case 2:  if (ridd) {res = R.drawable.g_3_2r;} else {res = R.drawable.g_3_2;}  break;
                    case 3:  if (ridd) {res = R.drawable.g_3_3r;} else {res = R.drawable.g_3_3;}  break;
                    case 4:  if (ridd) {res = R.drawable.g_3_4r;} else {res = R.drawable.g_3_4;}  break;
                    case 5:  if (ridd) {res = R.drawable.g_3_5r;} else {res = R.drawable.g_3_5;}  break;
                    case 6:  if (ridd) {res = R.drawable.g_3_6r;} else {res = R.drawable.g_3_6;}  break;
                    case 7:  if (ridd) {res = R.drawable.g_3_7r;} else {res = R.drawable.g_3_7;}  break;
                    case 8:  if (ridd) {res = R.drawable.g_3_8r;} else {res = R.drawable.g_3_8;}  break;
                    case 9:  if (ridd) {res = R.drawable.g_3_9r;} else {res = R.drawable.g_3_9;}  break;
                    case 10:  if (ridd) {res = R.drawable.g_3_10r;} else {res = R.drawable.g_3_10;}  break;
                }
                break; //

            case 4: // orecchini
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.g_4_1r;} else {res = R.drawable.g_4_1;} break;
                    case 2:  if (ridd) {res = R.drawable.g_4_2r;} else {res = R.drawable.g_4_2;}  break;
                    case 3:  if (ridd) {res = R.drawable.g_4_3r;} else {res = R.drawable.g_4_3;}  break;
                    case 4:  if (ridd) {res = R.drawable.g_4_4r;} else {res = R.drawable.g_4_4;}  break;
                    case 5:  if (ridd) {res = R.drawable.g_4_5r;} else {res = R.drawable.g_4_5;}  break;
                    case 6:  if (ridd) {res = R.drawable.g_4_6r;} else {res = R.drawable.g_4_6;}  break;
                    case 7:  if (ridd) {res = R.drawable.g_4_7r;} else {res = R.drawable.g_4_7;}  break;
                    case 8:  if (ridd) {res = R.drawable.g_4_8r;} else {res = R.drawable.g_4_8;}  break;
                    case 9:  if (ridd) {res = R.drawable.g_4_9r;} else {res = R.drawable.g_4_9;}  break;
                }
                break; //


        }
        return res;
    }

    private int immoImgPelletteria(int subcat, int cod,boolean ridd) {
        int res = 0;
        switch (subcat) {

            case 1: // borse piccole
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.p_1_1r;} else {res = R.drawable.p_1_1;} break;
                    case 2:  if (ridd) {res = R.drawable.p_1_2r;} else {res = R.drawable.p_1_2;}  break;
                    case 3:  if (ridd) {res = R.drawable.p_1_3r;} else {res = R.drawable.p_1_3;}  break;
                    case 4:  if (ridd) {res = R.drawable.p_1_4r;} else {res = R.drawable.p_1_4;}  break;
                    case 5:  if (ridd) {res = R.drawable.p_1_5r;} else {res = R.drawable.p_1_5;}  break;
                }
                break;

            case 2: // piccola pelletteria
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.p_2_1r;} else {res = R.drawable.p_2_1;} break;
                    case 2:  if (ridd) {res = R.drawable.p_2_2r;} else {res = R.drawable.p_2_2;}  break;
                    case 3:  if (ridd) {res = R.drawable.p_2_3r;} else {res = R.drawable.p_2_3;}  break;
                    case 4:  if (ridd) {res = R.drawable.p_2_4r;} else {res = R.drawable.p_2_4;}  break;
                    case 5:  if (ridd) {res = R.drawable.p_2_5r;} else {res = R.drawable.p_2_5;}  break;
                    case 6:  if (ridd) {res = R.drawable.p_2_6r;} else {res = R.drawable.p_2_6;}  break;
                    case 7:  if (ridd) {res = R.drawable.p_2_7r;} else {res = R.drawable.p_2_7;}  break;
                }
                break;

            case 3: // borse
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.p_3_1r;} else {res = R.drawable.p_3_1;} break;
                    case 2:  if (ridd) {res = R.drawable.p_3_2r;} else {res = R.drawable.p_3_2;}  break;
                    case 3:  if (ridd) {res = R.drawable.p_3_3r;} else {res = R.drawable.p_3_3;}  break;
                    case 4:  if (ridd) {res = R.drawable.p_3_4r;} else {res = R.drawable.p_3_4;}  break;
                    case 5:  if (ridd) {res = R.drawable.p_3_5r;} else {res = R.drawable.p_3_5;}  break;
                    case 6:  if (ridd) {res = R.drawable.p_3_6r;} else {res = R.drawable.p_3_6;}  break;
                    case 7:  if (ridd) {res = R.drawable.p_3_7r;} else {res = R.drawable.p_3_7;}  break;
                    case 8:  if (ridd) {res = R.drawable.p_3_8r;} else {res = R.drawable.p_3_8;}  break;
                    case 9:  if (ridd) {res = R.drawable.p_3_9r;} else {res = R.drawable.p_3_9;}  break;
                    case 10:  if (ridd) {res = R.drawable.p_3_10r;} else {res = R.drawable.p_3_10;}  break;
                    case 11:  if (ridd) {res = R.drawable.p_3_11r;} else {res = R.drawable.p_3_11;}  break;
                    case 12:  if (ridd) {res = R.drawable.p_3_12r;} else {res = R.drawable.p_3_12;}  break;
                    case 13:  if (ridd) {res = R.drawable.p_3_13r;} else {res = R.drawable.p_3_13;}  break;
                    case 14:  if (ridd) {res = R.drawable.p_3_14r;} else {res = R.drawable.p_3_14;}  break;
                    case 15:  if (ridd) {res = R.drawable.p_3_15r;} else {res = R.drawable.p_3_15;}  break;
                    case 16:  if (ridd) {res = R.drawable.p_3_16r;} else {res = R.drawable.p_3_16;}  break;
                    case 17:  if (ridd) {res = R.drawable.p_3_17r;} else {res = R.drawable.p_3_17;}  break;
                    case 18:  if (ridd) {res = R.drawable.p_3_18r;} else {res = R.drawable.p_3_18;}  break;
                    case 19:  if (ridd) {res = R.drawable.p_3_19r;} else {res = R.drawable.p_3_19;}  break;
                    case 20:  if (ridd) {res = R.drawable.p_3_20r;} else {res = R.drawable.p_3_20;}  break;
                }
                break;


        }
        return res;
    }

    private int immoImgCollezione_1(int subcat, int cod,boolean ridd) {
        int res = 0;
        switch (subcat) {
                case 1: // pantaloni
                    switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.a1_1_1r;} else {res = R.drawable.a1_1_1; } break;
                        case 2:  if (ridd) {res = R.drawable.a1_1_2r;} else {res = R.drawable.a1_1_2; }  break;
                        case 3:  if (ridd) {res = R.drawable.a1_1_3r;} else {res = R.drawable.a1_1_3; }  break;
                        case 4:  if (ridd) {res = R.drawable.a1_1_4r;} else {res = R.drawable.a1_1_4; }  break;
                        case 5:  if (ridd) {res = R.drawable.a1_1_5r;} else {res = R.drawable.a1_1_5; }  break;
                    }
                    break; // pantaloni
                case 2: // gonne
                    switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.a1_2_1r;} else {res = R.drawable.a1_2_1; }  break;
                        case 2:  if (ridd) {res = R.drawable.a1_2_2r;} else {res = R.drawable.a1_2_2; }  break;
                    }
                    break; // gonne
                case 3: // camicie
                    switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.a1_3_1r;} else {res = R.drawable.a1_3_1; }  break;
                        case 2:  if (ridd) {res = R.drawable.a1_3_2r;} else {res = R.drawable.a1_3_2; }  break;
                        case 3:  if (ridd) {res = R.drawable.a1_3_3r;} else {res = R.drawable.a1_3_3; }  break;
                    }
                    break; // camicie
                case 4: // capispalla
                    switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.a1_4_1r;} else {res = R.drawable.a1_4_1; }  break;
                        case 2:  if (ridd) {res = R.drawable.a1_4_2r;} else {res = R.drawable.a1_4_2; }  break;
                        case 3:  if (ridd) {res = R.drawable.a1_4_3r;} else {res = R.drawable.a1_4_3; }  break;
                        case 4:  if (ridd) {res = R.drawable.a1_4_4r;} else {res = R.drawable.a1_4_4; }  break;
                    }
                    break; // capispalla
                case 5: // abiti
                    switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.a1_5_1r;} else {res = R.drawable.a1_5_1; }  break;
                        case 2:  if (ridd) {res = R.drawable.a1_5_2r;} else {res = R.drawable.a1_5_2; }  break;
                        case 3:  if (ridd) {res = R.drawable.a1_5_3r;} else {res = R.drawable.a1_5_3; }  break;
                        case 4:  if (ridd) {res = R.drawable.a1_5_4r;} else {res = R.drawable.a1_5_4; }  break;
                        case 5:  if (ridd) {res = R.drawable.a1_5_5r;} else {res = R.drawable.a1_5_5; }  break;
                        case 6:  if (ridd) {res = R.drawable.a1_5_6r;} else {res = R.drawable.a1_5_6; }  break;
                        case 7:  if (ridd) {res = R.drawable.a1_5_7r;} else {res = R.drawable.a1_5_7; }  break;
                        case 8:  if (ridd) {res = R.drawable.a1_5_8r;} else {res = R.drawable.a1_5_8; }  break;
                        case 9:  if (ridd) {res = R.drawable.a1_5_9r;} else {res = R.drawable.a1_5_9; }  break;
                        case 10:  if (ridd) {res = R.drawable.a1_5_10r;} else {res = R.drawable.a1_5_10; }  break;
                        case 11:  if (ridd) {res = R.drawable.a1_5_11r;} else {res = R.drawable.a1_5_11; }  break;
                        case 12:  if (ridd) {res = R.drawable.a1_5_12r;} else {res = R.drawable.a1_5_12; }  break;
                    }
                    break; // abiti
                case 6: // giacche
                    switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.a1_6_1r;} else {res = R.drawable.a1_6_1; }  break;
                        case 2:  if (ridd) {res = R.drawable.a1_6_2r;} else {res = R.drawable.a1_6_2; }  break;
                        case 3:  if (ridd) {res = R.drawable.a1_6_3r;} else {res = R.drawable.a1_6_3; }  break;
                        case 4:  if (ridd) {res = R.drawable.a1_6_4r;} else {res = R.drawable.a1_6_4; }  break;
                        case 5:  if (ridd) {res = R.drawable.a1_6_5r;} else {res = R.drawable.a1_6_5; }  break;
                        case 6:  if (ridd) {res = R.drawable.a1_6_6r;} else {res = R.drawable.a1_6_6; }  break;
                        case 7:  if (ridd) {res = R.drawable.a1_6_7r;} else {res = R.drawable.a1_6_7; }  break;
                    }
                    break; // giacche
                case 7: // top bluse
                    switch (cod) {
                        case 1:  if (ridd) {res = R.drawable.a1_7_1r;} else {res = R.drawable.a1_7_1; }  break;
                        case 2:  if (ridd) {res = R.drawable.a1_7_2r;} else {res = R.drawable.a1_7_2; }  break;
                        case 3:  if (ridd) {res = R.drawable.a1_7_3r;} else {res = R.drawable.a1_7_3; }  break;
                        case 4:  if (ridd) {res = R.drawable.a1_7_4r;} else {res = R.drawable.a1_7_4; }  break;
                        case 5:  if (ridd) {res = R.drawable.a1_7_5r;} else {res = R.drawable.a1_7_5; }  break;
                        case 6:  if (ridd) {res = R.drawable.a1_7_6r;} else {res = R.drawable.a1_7_6; }  break;
                    }
                    break; // top bluse
        }
        return res;
    }

    private int immoImgCollezione_2(int subcat, int cod,boolean ridd) {
        int res = 0;
        switch (subcat) {
            case 1: // pantaloni
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.a2_1_1r;} else {res = R.drawable.a2_1_1; } break;
                    case 2:  if (ridd) {res = R.drawable.a2_1_2r;} else {res = R.drawable.a2_1_2; }  break;
                    case 3:  if (ridd) {res = R.drawable.a2_1_3r;} else {res = R.drawable.a2_1_3; }  break;
                    case 4:  if (ridd) {res = R.drawable.a2_1_4r;} else {res = R.drawable.a2_1_4; }  break;
                    case 5:  if (ridd) {res = R.drawable.a2_1_5r;} else {res = R.drawable.a2_1_5; }  break;
                    case 6:  if (ridd) {res = R.drawable.a2_1_6r;} else {res = R.drawable.a2_1_6; }  break;
                }
                break; // pantaloni
            case 2: // gonne
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.a2_2_1r;} else {res = R.drawable.a2_2_1; }  break;
                    case 2:  if (ridd) {res = R.drawable.a2_2_2r;} else {res = R.drawable.a2_2_2; }  break;
                    case 3:  if (ridd) {res = R.drawable.a2_2_3r;} else {res = R.drawable.a2_2_3; }  break;
                }
                break; // gonne
            case 3: // camicie
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.a2_3_1r;} else {res = R.drawable.a2_3_1; }  break;
                    case 2:  if (ridd) {res = R.drawable.a2_3_2r;} else {res = R.drawable.a2_3_2; }  break;
                    case 3:  if (ridd) {res = R.drawable.a2_3_3r;} else {res = R.drawable.a2_3_3; }  break;
                }
                break; // camicie
            case 4: // capispalla
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.a2_4_1r;} else {res = R.drawable.a2_4_1; }  break;
                    case 2:  if (ridd) {res = R.drawable.a2_4_2r;} else {res = R.drawable.a2_4_2; }  break;
                    case 3:  if (ridd) {res = R.drawable.a2_4_3r;} else {res = R.drawable.a2_4_3; }  break;
                }
                break; // capispalla
            case 5: // abiti
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.a2_5_1r;} else {res = R.drawable.a2_5_1; }  break;
                    case 2:  if (ridd) {res = R.drawable.a2_5_2r;} else {res = R.drawable.a2_5_2; }  break;
                    case 3:  if (ridd) {res = R.drawable.a2_5_3r;} else {res = R.drawable.a2_5_3; }  break;
                    case 4:  if (ridd) {res = R.drawable.a2_5_4r;} else {res = R.drawable.a2_5_4; }  break;
                    case 5:  if (ridd) {res = R.drawable.a2_5_5r;} else {res = R.drawable.a2_5_5; }  break;
                    case 6:  if (ridd) {res = R.drawable.a2_5_6r;} else {res = R.drawable.a2_5_6; }  break;
                    case 7:  if (ridd) {res = R.drawable.a2_5_7r;} else {res = R.drawable.a2_5_7; }  break;
                    case 8:  if (ridd) {res = R.drawable.a2_5_8r;} else {res = R.drawable.a2_5_8; }  break;
                    case 9:  if (ridd) {res = R.drawable.a2_5_9r;} else {res = R.drawable.a2_5_9; }  break;
                }
                break; // abiti
            case 6: // giacche
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.a2_6_1r;} else {res = R.drawable.a2_6_1; }  break;
                    case 2:  if (ridd) {res = R.drawable.a2_6_2r;} else {res = R.drawable.a2_6_2; }  break;
                    case 3:  if (ridd) {res = R.drawable.a2_6_3r;} else {res = R.drawable.a2_6_3; }  break;
                    case 4:  if (ridd) {res = R.drawable.a2_6_4r;} else {res = R.drawable.a2_6_4; }  break;
                    case 5:  if (ridd) {res = R.drawable.a2_6_5r;} else {res = R.drawable.a2_6_5; }  break;
                    case 6:  if (ridd) {res = R.drawable.a2_6_6r;} else {res = R.drawable.a2_6_6; }  break;
                    case 7:  if (ridd) {res = R.drawable.a2_6_7r;} else {res = R.drawable.a2_6_7; }  break;
                }
                break; // giacche
            case 7: // top bluse
                switch (cod) {
                    case 1:  if (ridd) {res = R.drawable.a2_7_1r;} else {res = R.drawable.a2_7_1; }  break;
                    case 2:  if (ridd) {res = R.drawable.a2_7_2r;} else {res = R.drawable.a2_7_2; }  break;
                }
                break; // top bluse
        }
        return res;
    }


    private int immoImg(int cat,int subcat, int cod,boolean ridd) {
        int res = 0;
        switch (cat) {

            case 1: res = immoImgCollezione_1(subcat, cod, ridd); break;   // Abbigliamento 1

            case 2: res = immoImgCollezione_2(subcat, cod, ridd); break;   // Abbigliamento 2

            case 3:  res = immoImgPelletteria(subcat, cod, ridd);  break;  // 3 pelletteria

            case 4:  res = immoImgScarpe(subcat, cod, ridd);  break;  // 4 scarpe

            case 5: res = immoImgGioielli(subcat, cod, ridd);  break; // 5 gioielli

        }
        return res;
    }

}
